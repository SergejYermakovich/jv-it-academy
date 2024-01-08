package lesson5.test;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
//        while (needIteration) {
//
//            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {

                    // swap
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;

//                    needIteration = true;
                }
            }
//        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
