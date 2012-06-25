package registry

import static java.util.Calendar.*
import static org.apache.commons.lang.time.DateUtils.truncate

public enum DayOfWeek {
    MON(Calendar.MONDAY), TUE(Calendar.TUESDAY), WED(Calendar.WEDNESDAY), THU(Calendar.THURSDAY), FRI(Calendar.FRIDAY), SAT(Calendar.SATURDAY), SUN(Calendar.SUNDAY)

    private int dayOfWeekForCalendar

    DayOfWeek(int dayOfWeekForCalendar) {
        this.dayOfWeekForCalendar = dayOfWeekForCalendar
    }

    int forCalendarAPI() {
        return dayOfWeekForCalendar
    }

    static Date startDateOfCurrentWeek() {
        return dateForDayOfWeek(MON)
    }

    static Date endDateOfCurrentWeek() {
        return dateForDayOfWeek(SUN)
    }

    static Date startDateOfWeek(Date dateWithinWeek) {
        return dateForDayOfWeek(MON, dateWithinWeek)
    }

    static Date endDateOfWeek(Date dateWithinWeek) {
        return dateForDayOfWeek(SUN, dateWithinWeek)
    }

    static Date dateForDayOfWeek(DayOfWeek dayOfWeek, Date date = new Date()) {
        Calendar cnd = getInstance()
        cnd.setFirstDayOfWeek(MONDAY)
        cnd.time = date
        cnd.set(DAY_OF_WEEK, dayOfWeek.forCalendarAPI())
        return truncate(cnd.time, Calendar.DATE)
    }

    static DayOfWeek dayOfWeekByDate(Date date) {
        def cnd = Calendar.getInstance()
        cnd.setFirstDayOfWeek(Calendar.MONDAY)
        cnd.time = date
        switch (cnd.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return MON
            case Calendar.TUESDAY:
                return TUE
            case Calendar.WEDNESDAY:
                return WED
            case Calendar.THURSDAY:
                return THU
            case Calendar.FRIDAY:
                return FRI
            case Calendar.SATURDAY:
                return SAT
            case Calendar.SUNDAY:
                return SUN
        }
        throw new IllegalAccessException("Incorrect date ${date}")
    }
}