package lesson6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 5, 8, 7, 10, 9, -2, -9};

        System.out.println("Before:");
        System.out.println(Arrays.toString(array));


        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] =  array[i + 1];
                    array[i + 1] = temp;
                    needIteration = true;
                }
            }
        }


        System.out.println();
        System.out.println("After:");
        System.out.println(Arrays.toString(array));


    }
}
