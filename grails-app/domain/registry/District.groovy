package registry


class District {

    String number

    static hasMany = [addresses: Address, doctors: Doctor]

    static constraints = {
    }
}
