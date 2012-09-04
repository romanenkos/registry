package registry

class Doctor {
    String firstName
    String middleName
    String lastName

    Speciality speciality

    String getFullName() {
        "${lastName} ${firstName} ${middleName}"
    }

    static hasMany = [scheduleItems: ScheduleItem]


    static constraints = {
    }
}
