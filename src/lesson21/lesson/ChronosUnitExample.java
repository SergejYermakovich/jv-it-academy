package lesson21.lesson;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronosUnitExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime yesterdayDateTime = LocalDateTime.of(2023,2,13,0,0);

        System.out.println(ChronoUnit.WEEKS.between(yesterdayDateTime, localDateTime));
    }

}
