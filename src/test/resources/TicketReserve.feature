#language: ru
Функционал: Покупка билета

  Сценарий: Покупка билета

    Дано пользователь авторизован с логином autotester и паролем autotester
    Когда заполняются поля:
      |Откуда|МОСКВА|
      |Куда|ВЛАДИМИР ПАСС|
      |Дата|02.11.2017|

    * Выполнено нажатие на кнопку - Найти
    * выбран поезд ЛАСТОЧКА с временем отправления 16:35
    * выполнен переход к вводу данных и выбору мест


    Когда заполняются личнные данные пассажира:
      |Фамилия|Иванов|
      |Имя|Иван|
      |Отчество|Иванович|
      |Дата рождения|11.11.1990|
      |Тип документа|Паспорт РФ|
      |Пол|Мужской|
      |Номер документа|1706100011|

    * в переменной цена сохранено значение стоимости билета
    * Выполнено нажатие на кнопку - Зарезервировать

    Тогда значения полей:
      |ФИО|ИВАНОВ ИВАН ИВАНОВИЧ|
      |Паспорт РФ|1706 100011|
      |Сумма|цена|