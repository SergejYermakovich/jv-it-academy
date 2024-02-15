package lesson21.lesson;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/*
* От текущей даты вывести расписание всех встреч, которые происходят
еженедельно в 13:00 в течение 2 месяцев.
* */
public class TimetableTask {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime dateAfterTwoMonth = current.plusMonths(1);

        while (current.isBefore(dateAfterTwoMonth)) {
            current = current.with(TemporalAdjusters.next(current.getDayOfWeek()))
                    .withHour(13)
                    .withMinute(0)
                    .withSecond(0)
                    .withNano(0);

            System.out.println(current);
        }
    }
}
