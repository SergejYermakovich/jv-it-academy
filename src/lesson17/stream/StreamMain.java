package lesson17.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> array = List.of(1, 2, 4, 334, 23, 212, 32, 33, 2, 126, 74, 767, 5, 5);


        array.stream()
                .filter(number -> number < 10)
                .distinct()
                .limit(3)
                .peek((number) -> {
                    System.out.println("мы отобрали - " + number);
                })
                .sorted()
                .map(number -> String.valueOf(number + 10) + "!!!")
                .forEach(System.out::println);




    }
}
