package lesson12;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("two");

        System.out.println(strings);
    }
}
