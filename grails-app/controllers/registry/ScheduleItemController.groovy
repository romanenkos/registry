package registry

class ScheduleItemController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 1, 100)
        [specialists: Doctor.list(params), specialistsTotal: Doctor.count()]
    }

    def createIrregular(long id) {
        Doctor doc = Doctor.findById(id);
        if (!doc) {
            render(status: 404, text: 'Доктора нема')
        } else {
            params['type'] = ScheduleItemType.IRREGULAR
            params['doctor'] = doc

            [scheduleItemInstance: new ScheduleItem(params)]
        }
    }

    def save() {
        params['date'] = params.date('date', 'dd-MM-yyyy')
        def scheduleItemInstance = new ScheduleItem(params)
        if (!scheduleItemInstance.save(flush: true)) {
            render(view: "createIrregular", model: [scheduleItemInstance: scheduleItemInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), scheduleItemInstance.id])
        redirect(action: "show", id: scheduleItemInstance.id)
    }

    def show(Long id) {
        def scheduleItemInstance = ScheduleItem.get(id)
        if (!scheduleItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), id])
            redirect(action: "list")
            return
        }

        [scheduleItemInstance: scheduleItemInstance]
    }

    def edit(Long id) {
        def scheduleItemInstance = ScheduleItem.get(id)
        if (!scheduleItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), id])
            redirect(action: "list")
            return
        }

        [scheduleItemInstance: scheduleItemInstance]
    }

    def update(Long id, Long version) {
        def scheduleItemInstance = ScheduleItem.get(id)
        if (!scheduleItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (scheduleItemInstance.version > version) {
                scheduleItemInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'scheduleItem.label', default: 'ScheduleItem')] as Object[],
                        "Another user has updated this ScheduleItem while you were editing")
                render(view: "edit", model: [scheduleItemInstance: scheduleItemInstance])
                return
            }
        }

        scheduleItemInstance.properties = params

        if (!scheduleItemInstance.save(flush: true)) {
            render(view: "edit", model: [scheduleItemInstance: scheduleItemInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), scheduleItemInstance.id])
        redirect(action: "show", id: scheduleItemInstance.id)
    }

}
