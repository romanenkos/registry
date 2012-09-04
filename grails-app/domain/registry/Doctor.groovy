package registry

class Doctor implements Comparable<Doctor>{
    String firstName
    String middleName
    String lastName

    Speciality speciality

    String getFullName() {
        "${lastName} ${firstName} ${middleName}"
    }

    static hasMany = [scheduleItems: ScheduleItem]


    static mapping = {
        scheduleItems sort: 'day', order: 'asc'
    }
    static constraints = {
    }

    @Override
    int compareTo(Doctor doctor) {
        if (doctor) {
            if (!doctor.speciality.equals(this.speciality)) {
                return -1 * doctor.speciality.getName().compareTo(this.speciality.getName())
            } else {
                return -1 * doctor.getFullName().compareTo(this.getFullName())
            }
        }
        return 1
    }
}
