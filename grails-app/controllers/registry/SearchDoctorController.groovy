package registry

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
        render(view: "list", model: [specialists: Doctor.findAllByLastNameLike("%${lastName}%")])
    }

    def scheduleById(long id) {
        render(view: "schedule", model: [specialist: Doctor.findById(id)])
    }

    def scheduleByDistrict(long id) {
        [district: District.findById(id)]
    }

    def allSpecialists() {
        render(view: "list", model: [specialists: Doctor.findAllBySpecialityNotEqual(Speciality.S0)])
    }

    def allDistrctDoctors() {
        render(view: "list", model: [specialists: Doctor.findAllBySpeciality(Speciality.S0)])

    }


}
