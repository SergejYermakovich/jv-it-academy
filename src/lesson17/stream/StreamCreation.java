package lesson17.stream;

import lesson14.forrest.Linden;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        long result = stringList.stream().filter(a -> !a.isEmpty())
                .peek(e -> System.out.println("not empty value: " + e)).count();

//        Stream.builder().add("q").add(2).build().forEach(StreamCreation::gra);

//        Stream<String> stringStream = Stream.of(
//                "1", "2"
//        );

    }
}
