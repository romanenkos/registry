import registry.Doctor
import registry.DayOfWeek
import registry.ScheduleItem
import registry.Speciality

class SpecialistsBootStrap {

    def init = { servletContext ->



        def doctor = new Doctor(lastName: 'Коваленко', firstName: 'Андрій', middleName: 'Васильович', speciality: Speciality.S1).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8:00 - 14:00', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8:00 - 14:00', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8:00 - 14:00', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8:00 - 14:00', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8:00 - 14:00', room: '405'))
        doctor.save()

        doctor = new Doctor(lastName: 'Шоломій', firstName: 'Євген', middleName: 'Іванович', speciality: Speciality.S1).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '10:00 - 18:00', room: '402'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8:00 - 16:00', room: '402'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '10:00 - 18:00', room: '402'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8:00 - 16:00', room: '402'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8:00 - 16:00', room: '402'))
        doctor.save()


        doctor = new Doctor(lastName: 'Штик', firstName: 'Олеся', middleName: 'Юріївна', speciality: Speciality.S2).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '10-15', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '9-14', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '10-15', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-14', room: '405'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-14', room: '405'))
        doctor.save()

        doctor = new Doctor(lastName: 'Семенюк', firstName: 'Любов', middleName: 'Анатоліївна', speciality: Speciality.S3).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '14-17', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '14-17', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12 ', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '14-17', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12 ', room: '403'))
        doctor.save()

        doctor = new Doctor(lastName: 'Ерастова', firstName: 'Ірина', middleName: 'Леонідівна', speciality: Speciality.S3).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-14 ', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14 ', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-18', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14 ', room: '403'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-18', room: '403'))
        doctor.save()

        doctor = new Doctor(lastName: 'Дудка', firstName: 'Віктор', middleName: 'Валерійович', speciality: Speciality.S4).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-16\n(12-14 денний стаціонар)', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-16\n(12-14 денний стаціонар)', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '10-16 денний стаціонар', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '14-18', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-16\n(12-14 денний стаціонар)', room: '311'))


        doctor = new Doctor(lastName: 'Мудрицька', firstName: 'Юлія', middleName: 'Геннадіївна', speciality: Speciality.S4).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '13-16', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11 (денний стаціонар)', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '-', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '13-16', room: '311'))

        doctor = new Doctor(lastName: 'Джус', firstName: 'Надія', middleName: 'Володимирівна', speciality: Speciality.S4).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11-17', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-18', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14', room: '311'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '311'))


        doctor = new Doctor(lastName: 'Боярчук', firstName: 'Людмила', middleName: 'Мартинівна', speciality: Speciality.S5).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '10-14', room: '304'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '13-16', room: '304'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-16', room: '304'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-14', room: '304'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-13', room: '304'))


        doctor = new Doctor(lastName: 'Зінченко', firstName: 'Наталія', middleName: 'Юріївна', speciality: Speciality.S6).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-18', room: '108'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '108'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-14', room: '108'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-18', room: '108'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '108'))


        doctor = new Doctor(lastName: 'Лобанова', firstName: 'Неля', middleName: 'Тимофіївна', speciality: Speciality.S7).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-14', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-14', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '315'))


        doctor = new Doctor(lastName: 'Мусіна', firstName: 'Віра', middleName: 'Іванівна', speciality: Speciality.S8).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8.30-13', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '-', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8.30-13', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '-', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8.30-13', room: '214'))

        doctor = new Doctor(lastName: 'Іценко', firstName: 'Аліна', middleName: 'Анатоліївна', speciality: Speciality.S8).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-16', room: '215'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-16', room: '215'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-16', room: '215'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-16', room: '215'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-16', room: '215'))

        doctor = new Doctor(lastName: 'Чернета', firstName: 'Ольга', middleName: 'Іванівна', speciality: Speciality.S8).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12.30-16.30', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12.30-16.30', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-13', room: '214'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '', room: '214'))

        doctor = new Doctor(lastName: 'Подолянко', firstName: 'Владислав', middleName: 'Павлович', speciality: Speciality.S9).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '322'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12.30-15.30', room: '322'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '322'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-12', room: '322'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '322'))

        doctor = new Doctor(lastName: 'Остапенко', firstName: 'Любов', middleName: 'Дмитрівна', speciality: Speciality.S10).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-12', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '13-16', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-12', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '323'))

        doctor = new Doctor(lastName: 'Андрійченко', firstName: 'Світлана', middleName: 'Миколаївна', speciality: Speciality.S10).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-18', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '9-15', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-18', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-18', room: '323'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '11-17', room: '323'))

        doctor = new Doctor(lastName: 'Пінчук', firstName: 'Катерина', middleName: 'Іванівна', speciality: Speciality.S11).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '13-18', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-13', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '13-18', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-13', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-13', room: '317'))

        doctor = new Doctor(lastName: 'Самород', firstName: 'Наталія', middleName: 'Аріївна', speciality: Speciality.S11).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-14', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-17', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-14', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-18', room: '317'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '11-17', room: '317'))

        doctor = new Doctor(lastName: 'Дерюга', firstName: 'Наталія', middleName: 'Сергіївна', speciality: Speciality.S12).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-18', room: '325'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '325'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-18', room: '325'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14', room: '325'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: 'Денний стаціонар', room: '325'))

        doctor = new Doctor(lastName: 'Бригинець', firstName: 'Галина', middleName: 'Миколаївна', speciality: Speciality.S13).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-15', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '315'))

        doctor = new Doctor(lastName: 'Кадіна', firstName: 'Ілона', middleName: 'Анатоліївна', speciality: Speciality.S13).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8.30-11.30', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '13-16', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '13-16', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '13-16', room: '315'))

        doctor = new Doctor(lastName: 'Ячменіхіна', firstName: 'Тамара', middleName: 'Миколаївна', speciality: Speciality.S14).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '10-13', room: '218'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8.30-10.30', room: '218'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: 'ВКК 14-16', room: '218'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '218'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8.30-11.30', room: '218'))

        doctor = new Doctor(lastName: 'Коростень', firstName: 'Олена', middleName: 'Миколаївна', speciality: Speciality.S15).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11-17', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '11-17', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: 'Денний стаціонар', room: '315'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '315'))

        doctor = new Doctor(lastName: 'Постоляко', firstName: 'Анна', middleName: 'Василівна', speciality: Speciality.S16).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-14', room: '103'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '103'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '11-17', room: '103'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14', room: '103'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '103'))

        doctor = new Doctor(lastName: 'Логоша', firstName: 'Наталія', middleName: 'Сергіївна', speciality: Speciality.S17).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: 'Денний стаціонар', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '13-16', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '13-16', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '401'))

        doctor = new Doctor(lastName: 'Воєвода-Набільская', firstName: 'Віта', middleName: 'Миколаївна', speciality: Speciality.S18).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-15', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-12', room: '401'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '401'))

        doctor = new Doctor(lastName: 'Гордієнко', firstName: 'Ірина', middleName: 'Анатоліївна', speciality: Speciality.S19).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8.30-13', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12.30-17.30', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8.30-13', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '10-14', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '', room: '324'))

        doctor = new Doctor(lastName: 'Івкіна', firstName: 'Ніна', middleName: 'Олександрівна', speciality: Speciality.S19).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '13-17.30', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-12.30', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '13-17.30', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '', room: '324'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '13-17.30', room: '324'))

        doctor = new Doctor(lastName: 'Дроботущенко', firstName: 'Тетяна', middleName: 'Володимирівна', speciality: Speciality.S20).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-16', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8.30-12.30', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-16', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-12.30', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8.30-12.30', room: ''))

        doctor = new Doctor(lastName: '', firstName: '', middleName: '', speciality: Speciality.S21).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-14', room: '318,\n319'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-14', room: '318,\n319'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-14', room: '318,\n319'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-14', room: '318,\n319'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-14', room: '318,\n319'))

        doctor = new Doctor(lastName: '', firstName: '', middleName: '', speciality: Speciality.S22).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-13', room: '408'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '9-13', room: '408'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-13', room: '408'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-13', room: '408'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-13', room: '408'))

        doctor = new Doctor(lastName: 'Ющенко', firstName: 'Віктор', middleName: 'Степанович', speciality: Speciality.S23).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: 'з 7.30', room: '409'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: 'з 7.30', room: '409'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: 'з 7.30', room: '409'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: 'з 7.30', room: '409'))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: 'з 7.30', room: '409'))

        doctor = new Doctor(lastName: 'Ткач', firstName: 'Наталія', middleName: 'Михайлівна', speciality: Speciality.S24).save()
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-13', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '9-13', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-13', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-13', room: ''))
        doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-13', room: ''))


    }

    def destroy = {
    }
}
