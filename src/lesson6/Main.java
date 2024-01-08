package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 1, 4, 6, 5, 8, 7, 10, 9, -2, -9};
        int[] newArray = Arrays.copyOf(array, array.length + 1);

//        for (int element: newArray) {
//            System.out.print(element + " ");
//        }

        int searchedElementIndex = Arrays.binarySearch(array, 4);

        System.out.println(searchedElementIndex);
    }
}
