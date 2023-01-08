1.
Создайте класс Phone, который содержит переменные number, model и weight.Создайте три экземпляра этого класса. Выведите на консоль значения их переменных. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. Добавить конструктор без параметров.Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.Создать метод sendMessage с массивом номеров. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

2.
Создать класс Person, который содержит: переменные fullName, age;методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит". Добавьте два конструктора  - Person() и Person(fullName, age).Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

3.
Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.Класс Driver содержит поля - ФИО, стаж вождения.Класс Engine содержит поля - мощность, производитель.Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine. Методы start()stop(), turnRight()turnLeft() которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.Пусть класс Driver расширяет класс Person.

4.
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:ФИО,номер читательского билета,факультет,дата рождения,телефон.Методы takeBook(), returnBook().Разработать программу, в которой создается массив объектов данного класса.Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать массив названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать массив объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия". Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги"

5.
Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
Создать массив типа Инструмент, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".

6.
Определить интерфейс Printable, содержащий метод void print().
Определить класс Book, реализующий интерфейс Printable.
Определить класс Magazine, реализующий интерфейс Printable.
Создать массив типа Printable, который будет содержать книги и журналы.
В цикле пройти по массиву и вызвать метод print() для каждого объекта.
Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг.

7.
Создаем абстракный класс Person и дочерние классы - Student, Mentor
Person -> FIO, (enum)pl, age, gender

pl->Java,Python,JavaScript,Flutter

Student -> (enum)payment -> FREE, PAYED, HALFPAYED, NOTPAYED, DELETED

Mentor  -> enum(degree) -> intern, junior, middle, senior

В классе Main реализовать методы enum: name(), ordinal(), values().

Создать по 3 экземпляра Student и Mentor и вывести на консоль
информацию о них.


8. Exception

Создать статический метод который принимает на вход три параметра: login,
password и confirmPassword. Login должен содержать только латинские
буквы, цифры и спецсимволы. Длина login должна быть не меньше 8
символов. Если login не соответствует этим требованиям, необходимо
выбросить WrongLoginException. Password должен содержать только латинские
буквы, цифры и знак подчеркивания. Длина password должна быть не меньше 8
символов. Также password и confirmPassword должны быть равны. Если
password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException.  WrongPasswordException и WrongLoginException -
пользовательские классы исключения с двумя конструкторами – один по
умолчанию, второй принимает сообщение исключения и передает его в
конструктор класса Exception. Обработка исключений проводится внутри
метода. Используем multi-catch block. Метод возвращает true, если
значения верны или false в другом случае.

9. LocalDateTime

Собрание

Создаем абстрактный класс Employee с полями: ФИО, ДР, Пол
и методы:получения актульного возраста,метод рассказывающий обязанности сотрудника.
Создаем Developer, CEO, PM классы, наследники Employee. Добавьте характерные
для каждого класса поля хотя бы одно поле. Переопределить метод
рассказывающий обязанности сотрудника.
 
Создаем класс Meeting с полями: dateTime(дата и время проведения),
продолжительлность в виде часов.
arrayOfParticipants(List участников), status->enum(статус встречи в виде перечислений).
методы:переноса встречи на определенное время,
метод принимающий массив встреч и сравнивающий время проведения.

10. List

Методы List

а) Создать динамический массив, содержащий объекты класса HeavyBox, который содержит поля имя и вес.
б) Распечатать его содержимое используя for each.
в) Изменить вес первого ящика на 1.
г) Удалить последний ящик.
д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
е) Удалить все ящики.


10.1 List

Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке и вывести результат на экран.
