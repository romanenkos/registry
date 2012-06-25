package registry

import org.apache.commons.lang.time.DateUtils

enum DayOfWeek {
    MON, TUE, WED, THU, FRI, SAT, SUN

    static Date startDateOfCurrentWeek() {
        Calendar cnd = Calendar.getInstance()
        cnd.setFirstDayOfWeek(Calendar.MONDAY)
        cnd.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
        return DateUtils.truncate(cnd.time, Calendar.DATE)
    }
}