package registry

class DoctorScheduleController {

    def schedule(int id) {
        def d = Doctor.findById(id)
        if (d) {
            [doctor: d, items: ScheduleItem.findAllByDoctor(d).sort {a, b -> a.day <=> b.day}.collect {
                [day: it.day, room: it.room, workingTime: it.workingTime]
            }]
        }
    }
}
