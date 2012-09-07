package registry

class Doctor implements Comparable<Doctor> {
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

    //it seems that by default scheduleItems is Not List but Set TODO fix if will give a problems
    Collection<ScheduleItem> getRegularScheduleItems() {
        scheduleItems.findAll {ScheduleItemType.REGULAR == it.type}
    }

    Collection<ScheduleItem> getIrregularScheduleItems() {
        scheduleItems.findAll {ScheduleItemType.IRREGULAR == it.type}
    }

    @Override
    int compareTo(Doctor doctor) {
        if (doctor) {
            if (!doctor.speciality.equals(this.speciality)) {
                return this.speciality.getName() <=> doctor.speciality.getName()
            } else {
                return this.getFullName() <=> doctor.getFullName()
            }
        }
        return 1
    }
}
