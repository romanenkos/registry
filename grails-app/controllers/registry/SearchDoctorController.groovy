package registry

import org.apache.commons.collections.CollectionUtils

class SearchDoctorController {

    def search(String address) {
        if (address) {
            def a = Address.findByAddress(address)
            if (a) {
                //TODO prepare links for doc's scheduleById.
                [address: a, district: a.district]
            }
        }

    }

    def byLastName(String lastName) {
        def specialists = Doctor.findAllByLastNameLike("%${lastName}%")
        Collections.sort(specialists)
        render(view: "list", model: [specialists: specialists])
    }

    def scheduleById(long id) {
        render(view: "schedule", model: [specialist: Doctor.findById(id)])
    }

    def scheduleByDistrict(long id) {
        [district: District.findById(id)]
    }

    def allSpecialists() {
        def specialists = Doctor.findAllBySpecialityNotEqual(Speciality.S0)
        Collections.sort(specialists)
        render(view: "list", model: [specialists: specialists])
    }

    def allDistrctDoctors() {
        def specialists = Doctor.findAllBySpeciality(Speciality.S0)
        Collections.sort(specialists)
        render(view: "list", model: [specialists: specialists])

    }


}
