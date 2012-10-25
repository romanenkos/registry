package registry

import grails.web.JSONBuilder
import java.text.SimpleDateFormat
import grails.plugins.springsecurity.Secured

//@Secured(['ROLE_ADMIN'])
class BackupController {
    SimpleDateFormat sdf = new SimpleDateFormat('dd-MM-yyyy')

    def index() {
        render(contentType: "text/json") {
            registry = {
                doctors = array {
                    for (s in Doctor.list()) {
                        doc = {
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
                                        date = null != item.date ? sdf.format(item.date) : null
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
                                        street = a.street
                                        kind = a.kind
                                        numbers = a.numbers
                                    }
                                }
                            }
                        }
                    }
                }
                doctorsForDistricts = array {
                    for (d in District.list()) {
                        xx = {
                            number = d.number
                            doctorIds = array {
                                for (doc in d.doctors) {
                                    docId = {
                                        id = doc.id
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
                doctors = array {
                    for (s in Doctor.list()) {
                        doc = {
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
                                        date = null != item.date ? sdf.format(item.date) : null
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
                                        street = a.street
                                        kind = a.kind
                                        numbers = a.numbers
                                    }
                                }
                            }
                        }
                    }
                }
                doctorsForDistricts = array {
                    for (d in District.list()) {
                        xx = {
                            number = d.number
                            doctorIds = array {
                                for (doc in d.doctors) {
                                    docId = {
                                        id = doc.id
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