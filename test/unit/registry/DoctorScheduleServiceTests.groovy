package registry



import grails.test.mixin.*
import org.junit.*

import static registry.DayOfWeek.FRI
import static registry.DayOfWeek.MON
import static registry.DayOfWeek.THU
import static registry.ScheduleItemType.REGULAR
import static registry.ScheduleItemType.IRREGULAR
import static registry.DayOfWeek.WED
import static registry.DayOfWeek.TUE
import org.apache.commons.lang.time.DateUtils

import static org.apache.commons.lang.time.DateUtils.addDays
import static java.util.Calendar.DAY_OF_WEEK
import static java.util.Calendar.MONDAY
import static java.util.Calendar.getInstance
import static java.util.Calendar.WEDNESDAY
import static registry.DayOfWeek.dateForDayOfWeek

@TestFor(DoctorScheduleService)
@Mock([Doctor, ScheduleItem])
class DoctorScheduleServiceTests {

    @Test
    void whenFindScheduleThenOrderedByDayOfWeek() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: FRI, type: REGULAR))
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR))
                .addToScheduleItems(new ScheduleItem(day: THU, type: REGULAR)).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert [MON, THU, FRI] == schedule.collect{it.day}
    }

    @Test
    void whenFindScheduleThenOverrideWithIrregular() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(day: TUE, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(day: WED, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(day: THU, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(day: FRI, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(date: dateForDayOfWeek(MON), type: IRREGULAR, workingTime: "DAY OFF"))
                .addToScheduleItems(new ScheduleItem(date: dateForDayOfWeek(WED), type: IRREGULAR, workingTime: "DAY OFF")).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 5
        assert schedule[0].workingTime == "DAY OFF"
        assert schedule[2].workingTime == "DAY OFF"
    }

    @Test
    void whenFindScheduleThenOverrideWithIrregularConsideringDate() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(day: TUE, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF1", date: addDays(new Date(), -30)))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF2", date: dateForDayOfWeek(MON))).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 2
        assert schedule[0].workingTime == "DAY OFF2"
    }
}
