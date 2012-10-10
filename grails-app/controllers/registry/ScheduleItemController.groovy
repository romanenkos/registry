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

    def createRegular(long id) {
        Doctor doc = Doctor.findById(id);
        if (!doc) {
            render(status: 404, text: 'Доктора нема')
        } else {
            params['type'] = ScheduleItemType.REGULAR
            params['doctor'] = doc

            [scheduleItemInstance: new ScheduleItem(params)]
        }
    }

    def save() {

        params['date'] = params.date('date', 'dd-MM-yyyy')
        def scheduleItemInstance = new ScheduleItem(params)

        if (ScheduleItemType.REGULAR.equals(scheduleItemInstance.type)) {
            def currentScheduleItem = ScheduleItem.findByDoctorAndDay(scheduleItemInstance.doctor, scheduleItemInstance.day)
            currentScheduleItem?.delete()
        }
        if (!scheduleItemInstance.save(flush: true)) {
            render(view: ScheduleItemType.REGULAR.equals(scheduleItemInstance.type) ? 'createRegular' : 'createIrregular', model: [scheduleItemInstance: scheduleItemInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'scheduleItem.label', default: 'ScheduleItem'), scheduleItemInstance.id])
        redirect(action: "editForDoctor", id: scheduleItemInstance.doctor.id)
    }

    def editForDoctor(Long id) {
        def doctor = Doctor.get(id)
        if (!doctor) {
            render(status: 404, text: 'Доктора нема')
            return
        }
        render(view: 'list', model: [specialists: [doctor], specialistsTotal: 1])
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
}
