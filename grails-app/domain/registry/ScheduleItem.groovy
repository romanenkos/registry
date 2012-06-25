package registry

class ScheduleItem {

    DayOfWeek day
    String room
    String workingTime
    ScheduleType type
    Date date
    Doctor doctor

    static constraints = {
    }
}
