package lesson22.dependencyInversion;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        PrintArray.printArray(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        PrintArray.printArray(linkedList);
    }
}
