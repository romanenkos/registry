package registry

class ScheduleItem {

    DayOfWeek day
    ScheduleItemType type = ScheduleItemType.REGULAR
    String room
    String workingTime
    String roomNext
    String workingTimeNext
    Date date



    static belongsTo = [doctor: Doctor]

    static mapping = {
        day(enumType: "ordinal")
    }
    static constraints = {
        date nullable: true
        day nullable: true
        room nullable: true
        roomNext nullable: true
        workingTimeNext nullable: true

    }
}
