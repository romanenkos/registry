import registry.Doctor
import registry.District
import registry.Address

class BootStrap {

    def init = { servletContext ->

        List<District> districts;
        3.times {
            new Doctor(firstName: "Fname${it}", middleName: "MName${it}", lastName: "LName${it}").save()

            District d = new District(number: "${it}")
            Set<Address> addresses = new HashSet<Address>();
            3.times { it1 ->
                Address a = new Address(district: d, street: "D${it}-Street${it1}", number: "D${it}-N${it1}" )
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
