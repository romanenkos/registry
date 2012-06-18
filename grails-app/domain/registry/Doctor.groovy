package registry

class Doctor {
    String firstName
    String middleName
    String lastName

    static hasMany = [scheduleItems: ScheduleItem]

    static constraints = {
    }
}
