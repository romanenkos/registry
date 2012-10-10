package registry

import org.springframework.dao.DataIntegrityViolationException

class AddressController {

    static allowedMethods = [save: "POST", update: "POST", delete: "GET"]

    def index() {
        redirect(action: "list", params: params)
    }


    def create() {
        if (params.get("district.id")) {
            [addressInstance: new Address(params)]
        } else {
            flash.message = 'Виберiть дiльницю до якої додати адресу'
            redirect(controller: 'districts', action: 'index')
        }

    }

    def save() {
        def addressInstance = new Address(params)
        if (!addressInstance.save(flush: true)) {
            render(view: "create", model: [addressInstance: addressInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'address.label', default: 'Address'), addressInstance.id])
        redirect(controller: 'district', action: 'edit', id: addressInstance.district.id)
    }

    def edit() {
        def addressInstance = Address.get(params.id)
        if (!addressInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'address.label', default: 'Address'), params.id])
            redirect(action: "list")
            return
        }

        [addressInstance: addressInstance]
    }

    def update() {
        def addressInstance = Address.get(params.id)
        if (!addressInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'address.label', default: 'Address'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (addressInstance.version > version) {
                addressInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'address.label', default: 'Address')] as Object[],
                        "Another user has updated this Address while you were editing")
                render(view: "edit", model: [addressInstance: addressInstance])
                return
            }
        }

        addressInstance.properties = params

        if (!addressInstance.save(flush: true)) {
            render(view: "edit", model: [addressInstance: addressInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'address.label', default: 'Address'), addressInstance.id])
        redirect(controller: "district", action: "edit", id: addressInstance.district.id)
    }

    def delete() {
        def addressInstance = Address.get(params.id)
        if (!addressInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'address.label', default: 'Address'), params.id])
            redirect(controller: "district", action: "list")
            return
        }

        try {
            def districtId = addressInstance.districtId
            addressInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'address.label', default: 'Address'), params.id])
            redirect(controller: "district", action: "edit", id: districtId)
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'address.label', default: 'Address'), params.id])
            redirect(controller: "district", action: "list")
        }
    }

    def search(String address) {

        [addresses: Address.findAllByAddressLike("%${address}%")]
    }
}
