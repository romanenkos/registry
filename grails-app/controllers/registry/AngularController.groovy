package registry

import grails.converters.JSON

class AngularController {

    DoctorScheduleService doctorScheduleService

    def index() { }

    def doctors() {
        render Doctor.list().collect{[firstName: it.firstName, lastName: it.lastName, middleName: it.middleName]} as JSON
    }

    def schedule(long id) {
        def schedule = doctorScheduleService.findSchedule(Doctor.get(id), 0).collect {[day: it.day.name, workingTime: it.workingTime, room: it.room]}
        render schedule as JSON
    }

    def addresses() {
        render Address.list() as JSON
    }
}
