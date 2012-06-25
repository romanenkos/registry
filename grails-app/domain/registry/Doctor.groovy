package registry

class Doctor {
    String firstName
    String middleName
    String lastName

    String getFullName() {
        "${firstName} ${middleName} ${lastName}"
    }

    static hasMany = [scheduleItems: ScheduleItem, districts: District]
    static belongsTo = District

    static constraints = {
    }
}
