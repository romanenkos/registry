class BootStrap {

    def init = { servletContext ->

        System.getProperties().setProperty("user.country", "UA")
        System.getProperties().setProperty("user.language", "ua")
    }

    def destroy = {
    }
}
