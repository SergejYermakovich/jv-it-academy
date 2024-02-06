package lesson18.preparing.tasks;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 8, 2, 3, 5, 7, 6, 9};

        boolean isSortNeeded = true;
        while (isSortNeeded) {
            isSortNeeded = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSortNeeded = true;
                }
            }

        }

        System.out.println(Arrays.toString(array));

    }


}
