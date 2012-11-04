package registry

import static registry.ScheduleItemType.IRREGULAR
import static registry.ScheduleItemType.REGULAR
import static registry.DayOfWeek.startDateOfWeek
import static registry.DayOfWeek.endDateOfWeek
import static registry.DayOfWeek.dayOfWeekByDate
import javax.validation.constraints.NotNull

import static registry.DayOfWeek.dateForDayOfWeek

class DoctorScheduleService {
    List<Map> findSchedule(@NotNull Doctor doctor, int weekCount = 0) {
        Calendar cnd = Calendar.getInstance()
        cnd.add(Calendar.WEEK_OF_YEAR, weekCount)

        def regular = ScheduleItem.findAllByDoctorAndType(doctor, REGULAR)
        def irregular = ScheduleItem.findAllByDoctorAndTypeAndDateGreaterThanEquals(doctor, IRREGULAR, startDateOfWeek(cnd.getTime()))
                .findAll {it.date <= endDateOfWeek(cnd.getTime())}
                .each {it.day = dayOfWeekByDate(it.date)}

        def irregularDays = irregular.collect {it.day}

        return (regular.findAll {!irregularDays.contains(it.day)} + irregular).sort {a, b -> a.day <=> b.day}.collect {
            [day: it.day, room: it.room, workingTime: it.workingTime, date: dateForDayOfWeek(it.day, cnd.getTime())]
        }
    }
}
