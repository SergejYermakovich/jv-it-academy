package lesson21.lesson;

import java.time.*;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime dateTime =  LocalDateTime.of(2001, 2,3, 12,11,21);
        System.out.println(dateTime);
    }
}
