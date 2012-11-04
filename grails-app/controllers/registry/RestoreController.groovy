package registry

import grails.converters.JSON
import grails.plugins.springsecurity.Secured
import org.codehaus.groovy.grails.web.json.JSONObject
import java.text.SimpleDateFormat

//@Secured(['ROLE_ADMIN'])
class RestoreController {

    static allowedMethods = [restore: "POST"]
    SimpleDateFormat sdf = new SimpleDateFormat('dd-MM-yyyy')

    def index() {
    }

    def cleanup() {
        render "Ok"
    }

    def restore() {

        def f = request.getFile('myFile')
        if (f.empty) {
            flash.message = 'file cannot be empty'
            render(view: 'uploadForm')
            return
        }
        List<District> districts = new ArrayList<District>();
        def jsonData = JSON.parse(f.getInputStream(), 'UTF-8')
        jsonData.registry.districts.each {district ->
            District newDistrict = new District(number: district.number).save()
            district.addresses.each {address ->
                newDistrict.addToAddresses(new Address(district: newDistrict, kind: address.kind, street: address.street, numbers: address.numbers))
            }
            newDistrict.save()
            districts.add(newDistrict)
        }

        List<Doctor> doctors = new ArrayList<Doctor>();

        jsonData.registry.doctors.each {doctor ->
            Doctor newDoctor = new Doctor(lastName: doctor.lastName, firstName: doctor.firstName, middleName: doctor.middleName, speciality: doctor.speciality.name).save()

            doctor.scheduleItems.each {si ->
                newDoctor.addToScheduleItems(new ScheduleItem(
                        day: JSONObject.NULL.equals(si.day) ? null : si.day.name,
                        type: si.type.name,
                        workingTime: si.workingTime,
                        room: JSONObject.NULL.equals(si.room) ? null : si.room,
                        date: JSONObject.NULL.equals(si.date) ? null : sdf.parse(si.date)))


                newDoctor.save()
            }

//            List<String> districtNumbers = new ArrayList<String>()
            jsonData.registry.doctorsForDistricts.each {docForDistrict ->
                docForDistrict.doctorIds.each {docId ->
                    if (docId.id.equals(doctor.id)) {
                        districts.each {district ->
                            if (district.number.equals(docForDistrict.number)) {
                                district.addToDoctors(newDoctor)

                            }
                        }
                    }
                }
            }


        }


        redirect(action: 'index')
    }
}