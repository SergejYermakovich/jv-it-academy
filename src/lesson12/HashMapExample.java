package lesson12;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        };
    }
}
