package registry

import org.springframework.dao.DataIntegrityViolationException

class DoctorScheduleController {

    private String formatTime(int hour, int minute) {
        "${formatNumber('number': hour, format: "00")}:${formatNumber('number': minute, format: "00")}"
    }

    def schedule(int id) {
        def d = Doctor.findById(id)
        if (d) {
            [doctor: d, items: ScheduleItem.findAllByDoctor(d, [sort: 'day']).sort {
                a, b -> a.day <=> b.day
            }.collect {
                [day: it.day, from: formatTime(it.hourFrom, it.minuteFrom), to: formatTime(it.hourTo, it.minuteTo)]
            }]
        }
    }
}
