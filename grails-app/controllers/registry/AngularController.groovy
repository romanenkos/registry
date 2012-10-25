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
        def doctor = Doctor.findById(id)
        if (doctor) {
            render(contentType: "text/json") {
                array {
                    for (s in doctorScheduleService.findSchedule(doctor, 0)) {
                        item = {
                            workingTime = s.workingTime
                            day = s.day.name
                            room = s.room
                        }
                    }
                }
            }
        } else {
            render(contentType: "text/json") {}
        }
    }
    def addresses(){
        render Address.list() as JSON
    }
}
