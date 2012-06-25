package registry

class DoctorScheduleController {

    DoctorScheduleService scheduleService

    def schedule(int id) {
        def doctor = Doctor.findById(id)
        if (doctor) {
            [doctor: doctor, items: scheduleService.findSchedule(doctor)]
        }
    }
}
