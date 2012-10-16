import registry.Doctor
import registry.District
import registry.Address
import registry.DayOfWeek
import registry.ScheduleItem
import registry.Speciality
import registry.ScheduleItemType
import grails.util.GrailsUtil

class DistrictsBootStrap {

    def init = { servletContext ->
        if ('development'.equals(GrailsUtil.environment)) {
            District district1 = new District(number: '1').save()
            district1.addToAddresses(new Address(district: district1, address: 'вул. Городянська '));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Менжинського'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Липинського'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Кленова'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Борщова'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Радищева'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Мотчанова'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Сагайдак'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Лаціса'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Комарова'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Волкова'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Рахматуліна 107-149'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Рахматуліна 136'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Рахматуліна 138'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Рахматуліна 140'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Малиновського'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Піщана'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Єрьоменко'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Шмідта'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Шевченка 217А'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Шевченка 246'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Шевченка 203-249'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Сосницька 100-142'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Сосницька 87-125'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. 50 років Перемоги 33'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Проспект Перемоги 203'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Проспект Перемоги 205'));
            district1.addToAddresses(new Address(district: district1, address: 'вул. Рокосовського 35.'));
            district1.addToAddresses(new Address(district: district1, address: 'пров. Радищева'));
            district1.addToAddresses(new Address(district: district1, address: 'пров. Лаціса'));
            district1.addToAddresses(new Address(district: district1, address: 'пров. Овражний'));
            district1.addToAddresses(new Address(district: district1, address: 'пров. 1-й Рахматуліна'));
            district1.addToAddresses(new Address(district: district1, address: 'пров. 2-й Рахматуліна'));
            district1.save()





            District district2 = new District(number: '2').save()
            district2.addToAddresses(new Address(district: district2, address: 'вул. Братів Гарамових'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Озерна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Шкільна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Урожайна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Яблучна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Дундича'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Річна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Вишнева'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Механізаторів'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Кривоноса'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Рахматуліна до 107 (не парні №)'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Рахматуліна до 136 (парні №)'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Вірьовки'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Сосницька до 87 (не парні №)'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Сосницька до 100 (парні №)'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Шевченка 99-201'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Шевченка 160А'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Шевченка 116-124'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Пухова 1-43'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Пухова 2-114А'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Калініна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Бобровицька'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Радіозаводська І, ІІ, ІІІ'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Жовтнева'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Східна'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Проспект Перемоги 187'));
            district2.addToAddresses(new Address(district: district2, address: 'вул. Проспект Перемоги 189.'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Механізаторів'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Кривоноса'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. І провулок Шевченко'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Калініна'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Бобровицький'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Жовтневий'));
            district2.addToAddresses(new Address(district: district2, address: 'пров. Новоселів'));
            district2.save()





            District district3 = new District(number: '3').save()
            district3.addToAddresses(new Address(district: district3, address: 'вул. Одинцова 8, 9А, 10, 10А, 11, 11А, 11Б, 12, 12А, 12Б, 13, 13А, 13Б, 14, 14Б, 15А, 16, 17'));
            district3.addToAddresses(new Address(district: district3, address: 'вул. Кільцева 20'));
            district3.addToAddresses(new Address(district: district3, address: 'вул. Пухова 45, 51'));
            district3.addToAddresses(new Address(district: district3, address: 'вул. Рокосовського 23, 27, 29'));
            district3.save()



            District district4 = new District(number: '4').save()
            district4.addToAddresses(new Address(district: district4, address: 'вул. Кривулевського'));
            district4.addToAddresses(new Address(district: district4, address: 'вул. Одинцова 1, 2, 3, 3А, 4, 5, 6, 7, 7А'));
            district4.addToAddresses(new Address(district: district4, address: 'вул. Рокосовського 2, 4, 4А, 6, 6А, 8, 10, 10А, 12, 12А, 12Б, 12В, 14А, 3, 5, 9, 11, 13, 15, 17, 17А, 19, 21.'));
            district4.addToAddresses(new Address(district: district4, address: 'пров. І Тракторний'));
            district4.addToAddresses(new Address(district: district4, address: 'пров. ІІ Тракторний.'));
            district4.save()

            District district5 = new District(number: '5').save()
            District district6 = new District(number: '6').save()
            District district7 = new District(number: '7').save()
            district7.addToAddresses(new Address(district: district7, address: 'вул. Рокосовського 14, 14Б, 14В, 16, 16А'));
            district7.addToAddresses(new Address(district: district7, address: 'вул. Пухова 107'));
            district7.addToAddresses(new Address(district: district7, address: 'вул. 50 років СРСР 2, 6, 6А, 8, 10А, 12А, 12Б, 16, 16А, 18А, 18Б'));
            district7.addToAddresses(new Address(district: district7, address: 'вул. Проспект Перемоги 191, 193, 195.'));
            district7.save()





            District district8 = new District(number: '8').save()
            district8.addToAddresses(new Address(district: district8, address: 'вул. Пухова 101, 103, 105, 109 (І, ІІ, ІІІ), 111, 113, 115, 115А, 117, 119, 121 '));
            district8.addToAddresses(new Address(district: district8, address: 'вул. Доценко 24, 26, 26А, 30, 30А, 32 '));
            district8.addToAddresses(new Address(district: district8, address: 'вул. Проспект Перемоги 199, 201 '));
            district8.save()

            District district9 = new District(number: '9').save()
            district9.addToAddresses(new Address(district: district9, address: 'Доценко 2, 2Б, 4А, 4Б, 6, 8, 8А, 10, 12, 14, 16, 18, 28'));
            district9.addToAddresses(new Address(district: district9, address: 'Рокосовського 18, 18А, 18Б, 20, 20А, 20Б, 22, 22А, 25'));
            district9.save()

            District district10 = new District(number: '10').save()
            District district11 = new District(number: '11').save()
            District district12 = new District(number: '12').save()
            district12.addToAddresses(new Address(district: district12, address: 'вул. Освіти 2-10,1-17, 26, 29, 86, 88, весь приватний сектор'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Рокосовського 51, 53'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Шевченка 104, 106, 108, 110, 112А'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Кочерги'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Некрасова'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Академіка Павлова 15, 17, 19, весь приватний сектор'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Орджонікідзе 68, 70, 72, приватний сектор з 79 до кінця вулиці, приватний сектор з 54 до кінця вулиці'));
            district12.addToAddresses(new Address(district: district12, address: 'вул. Полуботка 120, 124-130, 97-107'));
            district12.save()

            District district13 = new District(number: '13').save()
            District district14 = new District(number: '14').save()
            district14.addToAddresses(new Address(district: district14, address: 'вул. Шевченко 38-100, 59-91'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Савчука 1, 1А, 5'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Кордівка'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Молодшого 14-26, 42-78, 5-13, 21-47'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Відпочинку'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Станіславського'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Молодіжна'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Інтернаціональна'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. П.Комуни'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Орджонікідзе 1-77, 2-52'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Дзержинського (крім 8)'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. В.Інтернаціоналістів 11-39'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. 1 Травня 26-78, 41-111'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Полуботка 82-118, 59-85'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Петровського'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Грінченка'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Менделєєва'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Лизогуба'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Тельмана'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Ломоносова'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Артема'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. М.Вовчка'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Курганна'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Соснова 1-5, 2-32'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Ніжинська'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Федоровського'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. Подвойського'));
            district14.addToAddresses(new Address(district: district14, address: 'вул. 8 Березня'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. І та ІІ провулки Відпочинку'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. Молодіжний'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. Дзержинського'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. П.Комуни'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. Лермонтова'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. Курганний'));
            district14.addToAddresses(new Address(district: district14, address: 'пров. Ніжинський'));
            district14.save()

            District district15 = new District(number: '15').save()
            district15.addToAddresses(new Address(district: district15, address: 'вул. Шевченка 37, 41, 43, 45, 47, 47А, 49А, 49Б, 51, 53, 53А, 53Б, 53В, 22, 30'));
            district15.addToAddresses(new Address(district: district15, address: 'вул. Савчука 3, 7, 7А, 7Б, 11'));
            district15.addToAddresses(new Address(district: district15, address: 'вул. Лермонтова'));
            district15.addToAddresses(new Address(district: district15, address: 'вул. В. Інтернаціоналістів 1, 3, 5, 7, 9'));
            district15.addToAddresses(new Address(district: district15, address: 'вул. Шраги 4, 9, приватний сектор'));
            district15.addToAddresses(new Address(district: district15, address: 'вул. Молодшого 8, 12, 12А'));
            district15.save()







            District district16 = new District(number: '16').save()
            district16.addToAddresses(new Address(district: district16, address: 'вул. Проспект Перемоги 114-128, 11125, 143-159, 163,'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. В. Інтернаціоналістів 45, 47, 47А, 6, 8, 10, 41А-І, 41А-ІІ'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Полуботка 33-47, 44-68, 74, 74А, 46, 76, 78, 80'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Молодшого 3, 15-19, 28-40'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Дзержинського 8'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Менделєєва 1Б'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Шевченко 32'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Челюскінців 9'));
            district16.addToAddresses(new Address(district: district16, address: 'вул. Клари Цеткін'));
            district16.save()

            District district17 = new District(number: '17').save()
            district17.addToAddresses(new Address(district: district17, address: 'вул. 50 років ВЛКСМ'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Мстиславська 128-136, 165-173, приватний сектор'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Олексіїва 27-85, 484'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Красногвардійська приватний сектор, 10, 18А, 20, 22, 29, 31, 35'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Стрілецька 2-54'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Партизанська 1-57, 2-58 (крім 51, 53)'));
            district17.addToAddresses(new Address(district: district17, address: 'вул. Ібаррурі 41-85, 32-70'));
            district17.addToAddresses(new Address(district: district17, address: 'пров. І та ІІІ Олексіїва'));
            district17.addToAddresses(new Address(district: district17, address: 'пров. Красногвардійський'));
            district17.addToAddresses(new Address(district: district17, address: 'пров. Партизанський'));
            district17.addToAddresses(new Address(district: district17, address: 'пров. Ібаррурі.'));
            district17.save()

            District district18 = new District(number: '18').save()
            District district19 = new District(number: '19').save()
            District district20 = new District(number: '20').save()
            district20.addToAddresses(new Address(district: district20, address: 'вул. Героїв Чорнобиля (крім 1, 3, 5)'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Проспект Миру 125-137'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Бєлєвіч'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Горького 101-111'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Олексіїва 1-25, 2-44'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Ібарурі 1-39, 2-30'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Мстиславська приватний сектор, 94-126, 133-163'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Котовського'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Поліни Осипенко'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. 1 Травня 80-164, 113-141'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Таращанська'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Кибальчича'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Соснова 7-79, 32-100'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Проектна'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Грибоєдова'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Правди'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Довженко'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Київська 39-131, 52-136'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Васильченка'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Північна'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Підгорна'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Фікселя'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Таранущенко'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Репіна'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Седнівська'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Володимирська'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Самойловича'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Гориста'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Лісова'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Жуковського'));
            district20.addToAddresses(new Address(district: district20, address: 'вул. Короленко'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Героїв Чорнобиля'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Чернігівський'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Олексіїва ІІ '));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Сосновий'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Проектний'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Північний'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Фікселя'));
            district20.addToAddresses(new Address(district: district20, address: 'пров. Короленко І та ІІ'));
            district20.save()







            District district21 = new District(number: '21').save()
            District district22 = new District(number: '22').save()
            district22.addToAddresses(new Address(district: district22, address: 'вул. Пухова 127, 129 (І, ІІ, ІІІ), 130, 132, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154'));
            district22.addToAddresses(new Address(district: district22, address: 'вул. Доценко 21, 23, 25, 27.'));
            district22.save()

            District district23 = new District(number: '23').save()



            district23.addToAddresses(new Address(district: district23, address: 'вул. 1 Травня 182-342, 191-383'));
            district23.addToAddresses(new Address(district: district23, address: 'Олександрівка: Маресьєва, Корольова, Прорізна, Федорова, Черняхівського, Тополина, Сіверська, Лисенко, Будівельна, Б. Гмирі, Архітектурна, Польова, Землянічна, Спаська, Востришева, Новоукраїнська, Ворошилова, Єфремова, Балицького, Надії, Колхозна, Ком очкова, Поліська, Багряна, Садова, Шевченко, Грушевського, Скоропадського, Бонченкова, Авіації, Приміська.'));
            district23.addToAddresses(new Address(district: district23, address: 'пров. 1 Травня І та ІІ '));
            district23.addToAddresses(new Address(district: district23, address: 'пров. Корольова І та ІІ'));
            district23.addToAddresses(new Address(district: district23, address: 'пров. Надії І, ІІ, ІІІ'));
            district23.save()

            District district24 = new District(number: '24').save()
            district24.addToAddresses(new Address(district: district24, address: 'Рокосовського 28, 30, 32, 34, 36, 38, 40, 42, 42А, 44, 46, 48, 50, 54, 58, 60, 62, 66, 68, 70'));
            district24.addToAddresses(new Address(district: district24, address: 'Космонавтів 24, 26'));
            district24.save()


            District district25 = new District(number: '25').save()
            district25.addToAddresses(new Address(district: district25, address: 'вул. Проспект Перемоги 162, 164, 166, 168, 170, 174, 176, 178, 180, 182, 184'));
            district25.addToAddresses(new Address(district: district25, address: 'вул. Рокосовського 26, 37, 37А, 39, 41, 41А, 41Б, 43, 45, 45А, 49, 49А'));
            district25.addToAddresses(new Address(district: district25, address: 'вул. Доценко 1, 3А, 5А'));
            district25.addToAddresses(new Address(district: district25, address: 'вул. Піонерська 86-88'));
            district25.addToAddresses(new Address(district: district25, address: 'вул. Некрасова 84, 86, 88, 90'));
            district25.addToAddresses(new Address(district: district25, address: 'вул. Освіти 77, 79, 81, 83'));
            district25.save()



            District district26 = new District(number: '26').save()
            district26.addToAddresses(new Address(district: district26, address: 'вул. Космонавтів 1, 1А, 3, 3А, 3В, 5, 5А'));
            district26.addToAddresses(new Address(district: district26, address: 'вул. Доценко 11, 13, 13А, 13Б, 15, 15А, 15Б, 17, 17А, 17Б, 17В, 17Г, 25В'));
            district26.addToAddresses(new Address(district: district26, address: 'вул. Білова 18, 20, 22, 24'));
            district26.save()




            District district27 = new District(number: '27').save()
            District district28 = new District(number: '28').save()
            district28.addToAddresses(new Address(district: district28, address: 'вул. Білова 17, 21 (І, ІІ, ІІІ), 23 (І, ІІ, ІІІ), 25, 27, 29, 30 (І, ІІ, ІІІ), 31, 33, 37 (І, ІІ, ІІІ, ІV, V)'));
            district28.addToAddresses(new Address(district: district28, address: 'вул. Пухова 131 (І, ІІ, ІІІ), 133'));
            district28.addToAddresses(new Address(district: district28, address: 'вул. Приміська 21'));
            district28.save()

            District district29 = new District(number: '29').save()
            district29.addToAddresses(new Address(district: district29, address: 'вул. Білова 6, 8, 10, 12, 12А, 14'));
            district29.addToAddresses(new Address(district: district29, address: 'вул. Доценко 3, 5, 7, 7А, 7В, 9А'));
            district29.addToAddresses(new Address(district: district29, address: 'вул. Космонавтів 2, 4, 4А, 6, 8, 9, 10, 10А, 12, 14, 16, 18, 20, 22'));
            district29.save()



            District district30 = new District(number: '30').save()
            district30.addToAddresses(new Address(district: district30, address: 'вул. Білова 2, 4'));
            district30.addToAddresses(new Address(district: district30, address: 'вул. Рокосовського 54А, 56, 56А, 58А'));
            district30.addToAddresses(new Address(district: district30, address: 'вул. 1 Травня 155, 157, 159, 161, 161А, 163, 165 (І, ІІ), 166А, 167, 167А, 169 (І, ІІ), 171, 173, 173А, 175, 175А, 175-ІІ, 179, 179А, 189, 189А'));
            district30.save()

            District district31 = new District(number: '31').save()
            District district32 = new District(number: '32').save()


            district32.addToAddresses(new Address(district: district32, address: 'вул. Мстиславська 130, 132, 132А, 134, 138, 140, 167, 173, 175, 177, 179, 181'));
            district32.addToAddresses(new Address(district: district32, address: 'вул. Красно гвардійська 12, 14, 16, 18, 20, 17, 17А, 19, 21'));
            district32.addToAddresses(new Address(district: district32, address: 'вул. Партизанська 51, 53'));
            district32.addToAddresses(new Address(district: district32, address: 'вул. Ібарурі 80, 87'));
            district32.addToAddresses(new Address(district: district32, address: 'вул. Проспект Миру 157А, 157Б'));
            district32.save()


            District district33 = new District(number: '33').save()
            district33.addToAddresses(new Address(district: district33, address: 'вул.  Волковича 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 2, 2А, 2Б, 6, 8, 10, 12, 4, 14, 13Б'));
            district33.addToAddresses(new Address(district: district33, address: 'вул.  Проспект Миру 197А'));
            district33.addToAddresses(new Address(district: district33, address: 'вул.  Староказарменна '));
            district33.addToAddresses(new Address(district: district33, address: 'вул.  Кошового 6'));
            district33.save()
            District district34 = new District(number: '34').save()


            district34.addToAddresses(new Address(district: district34, address: 'вул.  Красно гвардійська 23, 25, 25А, 27, 27А, 29'));
            district34.addToAddresses(new Address(district: district34, address: 'вул.  Кошового 20, 22, 23, 24, 25, 27, 29, 31, 33'));
            district34.addToAddresses(new Address(district: district34, address: 'вул.  Волковича 3'));
            district34.addToAddresses(new Address(district: district34, address: 'вул.  Авіаторів'));
            district34.save()

            District district35 = new District(number: '35').save()

            district35.addToAddresses(new Address(district: district35, address: 'вул. Проспект Миру 216-303, 215А, 217А, 219, 247, 257'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Ударна'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Смирнова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Кірова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Тичини'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Польова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Коробко'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Мозирська'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. В.Василевської'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Шевцової'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Тюленіна'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Громової'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. гомельська'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Інструментальна'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Рудникова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Калинова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Василькова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Дачна 1-12'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Авдеєнко'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Матросова'));
            district35.addToAddresses(new Address(district: district35, address: 'вул. Гастелло'));
            district35.addToAddresses(new Address(district: district35, address: 'пров. Смирнова'));
            district35.save()

            District district36 = new District(number: '36').save()


            district36.addToAddresses(new Address(district: district36, address: 'вул. Проспект Миру 249, 251, 255, 255А, 259, 269, 271, 271А, 253'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Морозова'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Борисенка'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. С.Разіна'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Каштанова'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Гончарові'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Кузнечна'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Академіка Рево'));
            district36.addToAddresses(new Address(district: district36, address: 'вул. Пархоменко'));
            district36.addToAddresses(new Address(district: district36, address: 'пров. Пархоменко'));
            district36.save()
            District district37 = new District(number: '37').save()
            district37.addToAddresses(new Address(district: district37, address: 'вул. Проспект Миру 143, 143А, 147, 149, 149А, 151, 151А, 153, 155, 155А, 157, 159, 161, 126-170 та приватний сектор'));
            district37.addToAddresses(new Address(district: district37, address: 'вул. Красногвардійська 4, 6, 6А, 10, 1, 3, 3А, 3Б, 5, 5А, 5Б, 7, 9, 11, 11А, 13, 15'));
            district37.addToAddresses(new Address(district: district37, address: 'вул. Героїв Чорнобиля 1, 3, 5'));
            district37.addToAddresses(new Address(district: district37, address: 'вул. Мстиславська 169, 171'));
            district37.save()

            District district38 = new District(number: '38').save()
            district38.addToAddresses(new Address(district: district38, address: 'вул. Єськова'));
            district38.addToAddresses(new Address(district: district38, address: 'вул. Стрілецька 1'));
            district38.addToAddresses(new Address(district: district38, address: 'Півци: Урожайна, Чернігівська, Каштанова, Космонавтів, Юдашкіна'));
            district38.save()

            District district39 = new District(number: '39').save()
            District district40 = new District(number: '40').save()
            district40.addToAddresses(new Address(district: district40, address: 'вул. Проспект Миру 196, 196Г, 196В, 196Б, 196Д, 204, 207А, 209, 211, 211А, 210, 198, 212, 213А, 214, 215, 207, 205, 201А, 201Б, 203А, 206, 180А, 180, 184, 188, 167, 169, 171, 173, 175, 177, 179, 183, 182, 189, 193, 197, 199, 199А'));
            district40.addToAddresses(new Address(district: district40, address: 'вул. Кошового 3, 5, 14, 4, 4А, 16, 18'));
            district40.addToAddresses(new Address(district: district40, address: 'пров. Гомельський'));
            district40.save()

            // -+------------------------------------------1st department
            def doctor = new Doctor(lastName: 'Цицура', firstName: 'Олександра', middleName: 'Василівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-15', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-15', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '223'))


            Calendar cnd = Calendar.getInstance();
            cnd.add(Calendar.DAY_OF_WEEK, 1)
            doctor.addToScheduleItems(new ScheduleItem(type: ScheduleItemType.IRREGULAR, workingTime: 'Відпустка', date: cnd.getTime()))
            cnd.add(Calendar.DAY_OF_WEEK, 1)
            doctor.addToScheduleItems(new ScheduleItem(type: ScheduleItemType.IRREGULAR, workingTime: 'Відпустка', date: cnd.getTime()))
            cnd.add(Calendar.DAY_OF_WEEK, 1)
            doctor.addToScheduleItems(new ScheduleItem(type: ScheduleItemType.IRREGULAR, workingTime: 'Відпустка', date: cnd.getTime()))
            cnd.add(Calendar.DAY_OF_WEEK, 1)
            doctor.addToScheduleItems(new ScheduleItem(type: ScheduleItemType.IRREGULAR, workingTime: 'Відпустка', date: cnd.getTime()))

            doctor.save()
            district1.addToDoctors(doctor)
            district1.save()


            doctor = new Doctor(lastName: 'Ткаченко', firstName: 'Алла', middleName: 'Олександрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '15-18', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '15-18', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '224'))
            doctor.save()

            district2.addToDoctors(doctor)
            district2.save()
            district3.addToDoctors(doctor)
            district3.save()



            doctor = new Doctor(lastName: 'Бреславська', firstName: 'Марина', middleName: 'Ігорівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-12', room: '219'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '219'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '15-18', room: '219'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '219'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '14-17', room: '219'))
            doctor.save()

            district3.addToDoctors(doctor)
            district3.save()
            district7.addToDoctors(doctor)
            district7.save()





            doctor = new Doctor(lastName: 'Щербиніна', firstName: 'Надія', middleName: 'Миколаївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-15', room: '220'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '220'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8.30-11.30', room: '220'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '220'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '15-18', room: '220'))
            doctor.save()
            district4.addToDoctors(doctor)
            district4.save()



            doctor = new Doctor(lastName: 'Стародубцева', firstName: 'Наталія', middleName: 'Миколаївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11.30-14.30', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '11.30-14.30', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '224'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8.30-11.30', room: '224'))
            doctor.save()
            district8.addToDoctors(doctor)
            district8.save()



            doctor = new Doctor(lastName: 'Висоцька', firstName: 'Варвара', middleName: 'Володимирівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8.30-11.30', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '11.30-14.30', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '14-17', room: '223'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '223'))
            doctor.save()
            district9.addToDoctors(doctor)
            district9.save()
            //--------------------------------------------2nd department

            doctor = new Doctor(lastName: 'Пономаренко', firstName: 'Наталія', middleName: 'Григорівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '11-14', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '14-17', room: '211'))
            doctor.save()
            district12.addToDoctors(doctor)
            district12.save()



            doctor = new Doctor(lastName: 'Бондарець', firstName: 'Юлія', middleName: 'Іванівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11.30-14.30', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-15', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '210'))
            doctor.save()
            district14.addToDoctors(doctor)
            district14.save()





            doctor = new Doctor(lastName: 'Петренко', firstName: 'Алла', middleName: 'Іванівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '15-18', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-15', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12.30-15.30', room: '212'))
            doctor.save()

            district15.addToDoctors(doctor)
            district15.save()



            doctor = new Doctor(lastName: 'Лях', firstName: 'Віра', middleName: 'Степанівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '209'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '209'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '209'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '209'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '15-18', room: '209'))
            doctor.save()
            district16.addToDoctors(doctor)
            district16.save()





            doctor = new Doctor(lastName: 'Руденко', firstName: 'Тетяна', middleName: 'Василівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '15-18', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '15-18', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '211'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '211'))
            doctor.save()
            district17.addToDoctors(doctor)
            district17.save()

            doctor = new Doctor(lastName: 'Зорька', firstName: 'Ірина', middleName: 'Миколаївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-10.30', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '15-18', room: '210'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '210'))
            doctor.save()

            district20.addToDoctors(doctor)
            district20.save()


            doctor = new Doctor(lastName: 'Шестак', firstName: 'Ірина', middleName: 'Павлівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11-14', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8.30-11.30', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '212'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '212'))
            doctor.save()
            district37.addToDoctors(doctor)
            district37.save()
            //------------------------------------ 3d department

            doctor = new Doctor(lastName: 'Пінчук', firstName: 'Олександра', middleName: 'Олексіївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '13-16', room: '205'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '205'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '205'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '205'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '205'))
            doctor.save()
            district22.addToDoctors(doctor)
            district22.save()




            doctor = new Doctor(lastName: 'Воєвода', firstName: 'Віта', middleName: 'Миколаївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-12', room: '202'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '202'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '15-18', room: '202'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '15-18', room: '202'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '14-17', room: '202'))
            doctor.save()
            district23.addToDoctors(doctor)
            district23.save()


            doctor = new Doctor(lastName: 'Дейнека', firstName: 'Катерина', middleName: 'Віталіївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-12', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '9-12', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '13-16', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '204'))
            doctor.save()
            district24.addToDoctors(doctor)
            district24.save()




            doctor = new Doctor(lastName: 'Шихт', firstName: 'Олена', middleName: 'Генадіівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '15-18', room: '203'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '203'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '203'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '15-18', room: '203'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '203'))
            doctor.save()
            district25.addToDoctors(doctor)
            district25.save()
            district29.addToDoctors(doctor)
            district29.save()


            doctor = new Doctor(lastName: 'Дрох', firstName: 'Анна', middleName: 'Валеріївна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '15-18', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-15', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8.30-11.30', room: '206'))
            doctor.save()
            district25.addToDoctors(doctor)
            district25.save()
            district30.addToDoctors(doctor)
            district30.save()



            doctor = new Doctor(lastName: 'Мороз', firstName: 'Ірина', middleName: 'Петрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '14-17', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12.30-15.30', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8.30-11.30', room: '204'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12.30-15.30', room: '204'))
            doctor.save()
            district26.addToDoctors(doctor)
            district26.save()



            doctor = new Doctor(lastName: 'Андарал', firstName: 'Валентина', middleName: 'Петрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8.30-11.30', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '15-18', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8.30-11.30', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '206'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '15-18', room: '206'))
            doctor.save()
            district28.addToDoctors(doctor)
            district28.save()
            //-----------------------------4th district


            doctor = new Doctor(lastName: 'Чигір', firstName: 'Надія', middleName: 'Іванівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '14-17', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '12-15', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-12', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '307'))
            doctor.save()
            district32.addToDoctors(doctor)
            district32.save()




            doctor = new Doctor(lastName: 'Дудченко', firstName: 'Тетяна', middleName: 'Григорівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '11-14', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '13-16', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '310'))
            doctor.save()
            district33.addToDoctors(doctor)
            district33.save()



            doctor = new Doctor(lastName: 'Кліманська', firstName: 'Світлана', middleName: 'Дмитрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '14-17', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '9-12', room: '310'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '310'))
            doctor.save()
            district34.addToDoctors(doctor)
            district34.save()


            doctor = new Doctor(lastName: 'Апанасенко', firstName: 'Валентина', middleName: 'Іванівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '14-17', room: '305'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '305'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '8-11', room: '305'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '305'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '8-11', room: '305'))
            doctor.save()
            district35.addToDoctors(doctor)
            district35.save()




            doctor = new Doctor(lastName: 'Адамчук', firstName: 'Тамара', middleName: 'Дмитрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '9-12', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '12-15', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '12-15', room: '307'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '14-17', room: '307'))
            doctor.save()
            district36.addToDoctors(doctor)
            district36.save()


            doctor = new Doctor(lastName: 'Цвір', firstName: 'Марія', middleName: 'Олександрівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '8-11', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '14-17', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '9-12', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '11-14', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '9-12', room: '306'))
            doctor.save()
            district38.addToDoctors(doctor)
            district38.save()



            doctor = new Doctor(lastName: 'Жоголко', firstName: 'Ольга', middleName: 'Іванівна', speciality: Speciality.S0).save()
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.MON, workingTime: '12-15', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.TUE, workingTime: '8-11', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.WED, workingTime: '14-17', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.THU, workingTime: '8-11', room: '306'))
            doctor.addToScheduleItems(new ScheduleItem(day: DayOfWeek.FRI, workingTime: '12-15', room: '306'))
            doctor.save()
            district40.addToDoctors(doctor)
            district40.save()
        }

    }

    def destroy = {
    }
}
