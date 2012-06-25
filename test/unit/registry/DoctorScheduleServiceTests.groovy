package registry

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import org.junit.Test

import static org.apache.commons.lang.time.DateUtils.addDays
import static registry.DayOfWeek.*
import static registry.ScheduleItemType.IRREGULAR
import static registry.ScheduleItemType.REGULAR

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
        assert [MON, THU, FRI] == schedule.collect {it.day}
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
    void whenFindScheduleThenIgnoreIrregularInThePast() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF1", date: dateForDayOfWeek(MON, addDays(new Date(), -30))))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF2", date: dateForDayOfWeek(MON))).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 1
        assert schedule[0].workingTime == "DAY OFF2"
    }

    @Test
    void whenFindScheduleThenIgnoreIrregularInTheFuture() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF1", date: dateForDayOfWeek(MON, addDays(new Date(), 30))))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF2", date: dateForDayOfWeek(MON))).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 1
        assert schedule[0].workingTime == "DAY OFF2"
    }

    @Test
    void whenFindScheduleAndNoIrregularForCurrentWeekThenDontOverrideRegularSchedule() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: MON, type: REGULAR, workingTime: "09:00 - 17:00"))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF1", date: dateForDayOfWeek(MON, addDays(new Date(), -30))))
                .addToScheduleItems(new ScheduleItem(type: IRREGULAR, workingTime: "DAY OFF2", date: dateForDayOfWeek(MON, addDays(new Date(), 30))))
                .save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 1
        assert schedule[0].workingTime == "09:00 - 17:00"
    }

}
