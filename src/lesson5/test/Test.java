package lesson5.test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = {10, 2, 7, 3, 1, 12, 5};
        System.out.println(Arrays.toString(array));

        int count = 0;
        while (count < 10) {

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
            count++;

            System.out.println(Arrays.toString(array));
        }



    }
}
