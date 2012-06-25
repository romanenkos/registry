package registry

import javax.validation.constraints.NotNull

import static registry.DayOfWeek.startDateOfCurrentWeek
import static registry.ScheduleItemType.IRREGULAR
import static registry.ScheduleItemType.REGULAR

class DoctorScheduleService {
    List<Map> findSchedule(@NotNull Doctor doctor) {
        def regular = ScheduleItem.findAllByDoctorAndType(doctor, REGULAR)
        def irregular = ScheduleItem.findAllByDoctorAndTypeAndDateGreaterThanEquals(doctor, IRREGULAR, startDateOfCurrentWeek())
                .findAll {it.date <= DayOfWeek.dateForDayOfWeek(DayOfWeek.SUN, new Date())}
                .each {it.day = DayOfWeek.dayOfWeekByDate(it.date)}

        def irregularDays = irregular.collect {it.day}

        return (regular.findAll {!irregularDays.contains(it.day)} + irregular).sort {a, b -> a.day <=> b.day}.collect {
            [day: it.day, room: it.room, workingTime: it.workingTime]
        }
    }
}
