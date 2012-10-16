package registry

import grails.web.JSONBuilder
import java.text.SimpleDateFormat
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class BackupController {

    def index() {
        render(contentType: "text/json") {
            registry = {
                specialists = array {
                    for (s in Doctor.findAllBySpecialityNotEqual(Speciality.S0)) {
                        specialist = {
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

                districts = array {
                    for (d in District.list()) {
                        district = {
                            number = d.number
                            addresses = array {
                                for (a in d.addresses) {
                                    address = {
                                        address = a.address
                                    }
                                }
                            }
                            doctors = array {
                                for (s in d.doctors) {
                                    specialist = {
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
                }
            }
        }


    }

    def backup() {
        def builder = new JSONBuilder()
        def result = builder.build {
            registry = {
                specialists = array {
                    for (s in Doctor.findAllBySpecialityNotEqual(Speciality.S0)) {
                        specialist = {
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

                districts = array {
                    for (d in District.list()) {
                        district = {
                            number = d.number
                            addresses = array {
                                for (a in d.addresses) {
                                    address = {
                                        address = a.address
                                    }
                                }
                            }
                            doctors = array {
                                for (s in d.doctors) {
                                    specialist = {
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
                }
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm")
        sendMail {
            multipart true
            to "romanenkos@gmail.com", "registry.cn.ua@gmail.com"
            subject "Реєстратура"
            body 'Дивись файл у листі'
            attachBytes "Backup_${sdf.format(new Date())}.json", "application/json", result.toString().getBytes("UTF-8")
        }
        flash.message = 'Данні надіслані електронною поштою'
        redirect(url: '/')
    }
}