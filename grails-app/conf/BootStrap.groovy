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
            d.save()


            District district = new District(number: "${it}")
            Set<Address> addresses = new HashSet<Address>();
            3.times { it1 ->
                Address a = new Address(district: district, street: "D${it}-Street${it1}", number: "D${it}-N${it1}" )
                addresses.add(a);
            }

            d.addresses = addresses
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
