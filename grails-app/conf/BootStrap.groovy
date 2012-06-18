import registry.Doctor
import registry.DayOfWeek
import registry.ScheduleItem

class BootStrap {

    def init = { servletContext ->
        3.times {
            def d = new Doctor(firstName: "Fname${it}", middleName: "MName${it}", lastName: "LName${it}").save()
            DayOfWeek.values().each {
                d.addToScheduleItems(new ScheduleItem(day: it, hourFrom: 9, minuteFrom: 0, hourTo: 17, minuteTo: 59))
            }
            d.save()
        }
    }

    def destroy = {
    }
}
