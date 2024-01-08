package test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        int x = 1;
//        int[] a = {5, 3};
//        a[x] = --x;
//        System.out.println(a[1]);

        Map<String, String> map = new HashMap<>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        for (String value: map.values()) {
            System.out.println(value);
        }

    }
}
