package registry

class ScheduleItem {

    DayOfWeek day
    String room
    String workingTime
    ScheduleItemType type
    Date date
    Doctor doctor

    static constraints = {
    }
}
