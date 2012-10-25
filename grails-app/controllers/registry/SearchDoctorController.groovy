package registry

class SearchDoctorController {

    DoctorScheduleService doctorScheduleService

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
        render(view: "list", model: [specialists: Doctor.findAllByLastNameIlike("%${lastName}%").sort()])
    }

    def scheduleById(long id) {
        def doctor = Doctor.findById(id)
        def model = [:]
        if (doctor) {
            model['specialist'] = doctor
            model ['items'] = doctorScheduleService.findSchedule(doctor, 0)
        }
        render(view: "schedule", model: model)
    }

    def scheduleByDistrict(long id) {
        [district: District.findById(id)]
    }

    def allSpecialists() {
        render(view: "list", model: [specialists: Doctor.findAllBySpecialityNotEqual(Speciality.S0).sort()])
    }

    def allDistrctDoctors() {
        render(view: "list", model: [specialists: Doctor.findAllBySpeciality(Speciality.S0).sort()])

    }


}
