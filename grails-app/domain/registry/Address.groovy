package registry

class Address {

    String kind
    String street
    String numbers = ''

    static belongsTo = [district: District]

    String getAddress(){
        "${kind} ${street} ${numbers}"
    }
    static constraints = {
        street maxSize: 500
    }
    static mapping = {
        sort "street"
    }
}
