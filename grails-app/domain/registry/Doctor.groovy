package registry

class Doctor {
    String firstName
    String middleName
    String lastName

    String getFullName() {
        "${firstName} ${lastName}"
    }
    static hasMany = [scheduleItems: ScheduleItem]

    static constraints = {
    }
}
