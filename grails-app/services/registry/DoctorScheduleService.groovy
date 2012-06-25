package registry

import javax.validation.constraints.NotNull

import static registry.ScheduleItemType.REGULAR
import static registry.ScheduleItemType.IRREGULAR
import org.apache.commons.lang.time.DateUtils

import static registry.DayOfWeek.startDateOfCurrentWeek

class DoctorScheduleService {
    List<Map> findSchedule(@NotNull Doctor doctor) {
        def regular = ScheduleItem.findAllByDoctorAndType(doctor, REGULAR)
        def irregular = ScheduleItem.findAllByDoctorAndTypeAndDateGreaterThanEquals(doctor, IRREGULAR, startDateOfCurrentWeek()).each {
            it.day = DayOfWeek.dayOfWeekByDate(it.date)
        }

        def irregularDays = irregular.collect {it.day}

        return (regular.findAll {!irregularDays.contains(it.day)} + irregular).sort {a, b -> a.day <=> b.day}.collect {
            [day: it.day, room: it.room, workingTime: it.workingTime]
        }
    }
}
