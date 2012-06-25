package registry



import grails.test.mixin.*
import org.junit.*

import static registry.DayOfWeek.FRI
import static registry.DayOfWeek.MON
import static registry.DayOfWeek.THU
import static registry.ScheduleItemType.REGULAR
import static registry.ScheduleItemType.IRREGULAR

@TestFor(DoctorScheduleService)
@Mock([Doctor, ScheduleItem])
class DoctorScheduleServiceTests {

    @Test
    void whenFindScheduleThenConsiderOnlyRegularItems() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: FRI, type: REGULAR))
                .addToScheduleItems(new ScheduleItem(day: MON, type: IRREGULAR)).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert schedule.size() == 1
        assert schedule[0].day == FRI
    }

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
}
