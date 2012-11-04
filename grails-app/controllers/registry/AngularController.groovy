package registry

import grails.converters.JSON

class AngularController {

    DoctorScheduleService doctorScheduleService

    def index() { }

    def doctors() {
        render(contentType: "text/json") {
            array {
                for (s in Doctor.list()) {
                    specialist = {
                        id = s.id
                        firstName = s.firstName
                        lastName = s.lastName
                        middleName = s.middleName
                        speciality = s.speciality
                        scheduleItems = array {
                            for (item in s.scheduleItems) {
                                ite = {
                                    day = item.day
                                    room = item.room
                                    workingTime = item.workingTime
                                    type = item.type
                                    date = item.date
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    def schedule(long id) {
        def schedule = doctorScheduleService.findSchedule(Doctor.get(id), 0).collect {[day: it.day.name, workingTime: it.workingTime, room: it.room]}
        render schedule as JSON
    }

    def addresses() {
        render Address.list() as JSON
    }
}
