package registry

class ScheduleItem {

    DayOfWeek day
    String room
    String workingTime
    ScheduleItemType type = ScheduleItemType.REGULAR
    Date date
    Doctor doctor

    static constraints = {
        date nullable: true
    }
}
