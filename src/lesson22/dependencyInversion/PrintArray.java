package lesson22.dependencyInversion;

import java.util.List;

public class PrintArray {


    public  static void printArray(List<String> arrayList) {
        arrayList.forEach(System.out::println);
    }
}
