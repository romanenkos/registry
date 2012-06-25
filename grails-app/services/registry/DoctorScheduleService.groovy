package registry

import javax.validation.constraints.NotNull

import static registry.ScheduleItemType.REGULAR

class DoctorScheduleService {
    List<Map> findSchedule(@NotNull Doctor doctor) {
        def regular = ScheduleItem.findAllByDoctorAndType(doctor, REGULAR).sort {a, b -> a.day <=> b.day}.collect {
            [day: it.day, room: it.room, workingTime: it.workingTime]
        }
        return regular
    }
}
