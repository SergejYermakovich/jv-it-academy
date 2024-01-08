package lesson5.test;

public class CustomSort {


    private String testField;


    public static void main(String[] args) {

        int maximum = Integer.MAX_VALUE;


        int[] array = {23, 34, 1, 65, 43, 11, 234, 9};
//        print(array);

        System.out.println("---------------");


        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    minElementIndex = j;
                }
            }

            // swap
            int swapTemp = array[i];
            array[i] = minElement;
            array[minElementIndex] = swapTemp;


        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }




}
