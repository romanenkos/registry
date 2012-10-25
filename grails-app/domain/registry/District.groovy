package registry


class District {

    String number

    static hasMany = [addresses: Address, doctors: Doctor]

    static mapping = {
        addresses cascade: 'all-delete-orphan'
    }
    static constraints = {
    }
}
