# Калькулятор отпускных
Микросервис на Java, Spring-boot. Расчитывает сумму отпускных расчитывая по зарплате и кол-ву отпускных дней
## Как запустить
    1. Клонировать репозиторий себе на компьютер или скачать zip проекта
    2. Находясь в корне проекта прописать mvn spring-boot:run или в IDE запустить VacationPayApplication.
    3. Послать на ```localhost:8080/calculate?salary={ВАША_ЗАРПАЛАТА}&vacationDays={КОЛ-ВО_ДНЕЙ_ОТПУСКНОГО}```