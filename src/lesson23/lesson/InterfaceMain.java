package lesson23.lesson;

import java.util.Arrays;

public class InterfaceMain {
    public static void main(String[] args) {
//        Custom.class -> CustomInterface
        System.out.println(Arrays.stream(Custom.class.getInterfaces()).toList().contains(CustomInterface.class));
    }
}
