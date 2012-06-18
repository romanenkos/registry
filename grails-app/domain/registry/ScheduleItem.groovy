package registry

class ScheduleItem {

    DayOfWeek day

    int hourFrom
    int hourTo

    int minuteFrom
    int minuteTo

    static belongsTo = [doctor: Doctor]

    static constraints = {
    }
}
