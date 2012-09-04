package registry

class Address {

    String address
    District district


    static constraints = {
         address maxSize: 500
    }
}
