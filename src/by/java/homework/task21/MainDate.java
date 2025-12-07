package by.java.homework.task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class MainDate {
    static void main() {
//        1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        System.out.println("*********** текущая дата в формате 1 апреля 2023********************");
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);

        //2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
        System.out.println("*********** текущая дата в формате 1 апреля 2023, 10:59:20 PM********************");
        LocalDateTime currentDate1 = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy, h:mm:ss a");
        String formattedDate1 = currentDate1.format(formatter1);
        System.out.println(formattedDate1);

//3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
        System.out.println("*********** перевод в LocalDateTime по умолчанию ********************");
        String date = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd : h:mm:ss a");
        LocalDateTime dateFromString = LocalDateTime.parse(date, formatter2);
        System.out.println(dateFromString);

//4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
        System.out.println("*********** перевод в LocalDateTime по умолчанию 2********************");
        String date1 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время: 'HH:mm:ss");
        LocalDateTime dateFromString1 = LocalDateTime.parse(date1, formatter3);
        System.out.println(dateFromString1);

//5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
        System.out.println("*******текущая дата в формате понедельник 20 марта 2023 время: 11.54.06 PM ***********");
        LocalDateTime currentDate2 = LocalDateTime.now();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy 'время:' h:mm:ss a");
        String formattedDate2 = currentDate2.format(formatter4);
        System.out.println(formattedDate2);
    }
}
