import registry.Doctor

class BootStrap {

    def init = { servletContext ->
        3.times {
            new Doctor(firstName: "Fname${it}", middleName: "MName${it}", lastName: "LName${it}").save()
        }
    }

    def destroy = {
    }
}
