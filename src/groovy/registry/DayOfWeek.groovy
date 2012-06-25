package registry

import org.apache.commons.lang.time.DateUtils

import static java.util.Calendar.getInstance
import static java.util.Calendar.DAY_OF_WEEK
import static java.util.Calendar.WEDNESDAY
import static java.util.Calendar.MONDAY
import static org.apache.commons.lang.time.DateUtils.truncate
import static java.util.Calendar.DAY_OF_WEEK

public enum DayOfWeek {
    MON(Calendar.MONDAY), TUE(Calendar.TUESDAY), WED(Calendar.WEDNESDAY), THU(Calendar.THURSDAY), FRI(Calendar.FRIDAY), SAT(Calendar.SATURDAY), SUN(Calendar.SUNDAY)

    private int dayOfWeek

    DayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek
    }

    int toCalendarDayOfWeek() {
        return dayOfWeek
    }

    static Date startDateOfCurrentWeek() {
        return dateForDayOfWeek(MON)
    }

    static Date dateForDayOfWeek(DayOfWeek dayOfWeek) {
        Calendar cnd = getInstance()
        cnd.setFirstDayOfWeek(MONDAY)
        cnd.set(DAY_OF_WEEK, dayOfWeek.toCalendarDayOfWeek())
        return truncate(cnd.time, Calendar.DATE)
    }

    static DayOfWeek dayOfWeekByDate(Date date) {
        def cnd = Calendar.getInstance()
        cnd.setFirstDayOfWeek(Calendar.MONDAY)
        cnd.time = date
        switch (cnd.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return DayOfWeek.MON;
            case Calendar.TUESDAY:
                return DayOfWeek.TUE;
            case Calendar.WEDNESDAY:
                return DayOfWeek.WED;
            case Calendar.THURSDAY:
                return DayOfWeek.THU;
            case Calendar.FRIDAY:
                return DayOfWeek.FRI;
            case Calendar.SATURDAY:
                return DayOfWeek.SAT;
            case Calendar.SUNDAY:
                return DayOfWeek.SUN;
        }
        throw new IllegalAccessException("Incorrect date ${date}")
    }
}