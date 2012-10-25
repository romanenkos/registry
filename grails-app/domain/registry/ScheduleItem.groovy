package registry

class ScheduleItem {

    DayOfWeek day
    String room
    String workingTime
    ScheduleItemType type = ScheduleItemType.REGULAR
    Date date


    static belongsTo = [doctor: Doctor]

    static mapping = {
        day(enumType: "ordinal")
    }
    static constraints = {
        date nullable: true
        day nullable: true
        room nullable: true

    }
}
