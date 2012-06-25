import registry.Doctor
import registry.District
import registry.Address
import registry.DayOfWeek
import registry.ScheduleItem

class BootStrap {

    def init = { servletContext ->

        3.times {
            def doctor = new Doctor(firstName: "Fname${it}", middleName: "MName${it}", lastName: "LName${it}").save()
            DayOfWeek.values().each {  day ->
                doctor.addToScheduleItems(new ScheduleItem(day: day, workingTime: "9:00 - 18:00", room: "20${it}"))
            }



            District district = new District(number: "District-${it}")
            3.times { it1 ->
                district.addToAddresses(new Address(district: district, address: "D${it}-Street${it1}"));
            }

            district.save()
            doctor.addToDistricts(district)
            doctor.save()
        }
    }

    def destroy = {
    }
}
