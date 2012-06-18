import registry.Doctor
import registry.District
import registry.Address
import registry.DayOfWeek
import registry.ScheduleItem

class BootStrap {

    def init = { servletContext ->

        List<District> districts;
        3.times {
            def d = new Doctor(firstName: "Fname${it}", middleName: "MName${it}", lastName: "LName${it}").save()
            DayOfWeek.values().each {
                d.addToScheduleItems(new ScheduleItem(day: it, hourFrom: 9, minuteFrom: 0, hourTo: 17, minuteTo: 59))
            }

            District district = new District(number: "${it}")
            3.times { it1 ->
                district.addToAddresses(new Address(district: district, street: "D${it}-Street${it1}", number: "D${it}-N${it1}"));
            }

            if (!district.save()) {
                district.errors.each { er ->
                    println er
                }
            }


            d.addToDistricts(district)

            if (!d.save()) {
                d.errors.each { er ->
                    println er
                }
            }
        }
    }

    def destroy = {
    }
}
