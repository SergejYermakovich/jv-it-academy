package lesson21.lesson;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * 3 Определить сколько времени (в минутах)  прошло с начала текущей пары.
 * */
public class LessonDurationTask {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lessonStart = LocalTime.of(18, 30);

        long betweenInMinutes = ChronoUnit.MINUTES.between(lessonStart, currentTime);

        Duration duration = Duration.ofMinutes(betweenInMinutes);
        System.out.println(duration);
    }
}
