package registry

class ScheduleItem {

    DayOfWeek day

    int hourFrom
    int hourTo

    int minuteFrom
    int minuteTo

    Doctor doctor

    static constraints = {
    }
}
