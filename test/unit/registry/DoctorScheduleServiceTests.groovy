package registry



import grails.test.mixin.*
import org.junit.*

import static registry.DayOfWeek.FRI
import static registry.DayOfWeek.MON
import static registry.DayOfWeek.THU

@TestFor(DoctorScheduleService)
@Mock([Doctor, ScheduleItem])
class DoctorScheduleServiceTests {

    @Test
    void whenReturnScheduleThenOrderedByDayOfWeek() {
        //given
        def d = new Doctor(firstName: "fname", lastName: "lname", middleName: "mname")
                .addToScheduleItems(new ScheduleItem(day: FRI))
                .addToScheduleItems(new ScheduleItem(day: MON))
                .addToScheduleItems(new ScheduleItem(day: THU)).save()
        //when
        def schedule = service.findSchedule(d)
        //then
        assert [MON, THU, FRI] == schedule.collect{it.day}
    }
}
