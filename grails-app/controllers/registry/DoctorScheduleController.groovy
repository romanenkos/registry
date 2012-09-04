package registry

class DoctorScheduleController {

    DoctorScheduleService doctorScheduleService

    def schedule(int id, int w) {
        def doctor = Doctor.findById(id)
        if (doctor) {
            [doctor: doctor, items: doctorScheduleService.findSchedule(doctor, w), w: w]
        }
    }
    def byId(long id) {
        def doctor = Doctor.findById(id)
    }
}
