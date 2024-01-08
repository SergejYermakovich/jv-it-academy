package lesson5.algo;

public class CustomSort {
    public static void main(String[] args) {
        int[] array = {21, 11, 7, 32, 67, 63, 12, 1};
        for (int element : array) {
            System.out.print(element + " ");
        }

        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int indexOfMinElement = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    indexOfMinElement = j;
                }

            }
            sortedArray[i] = minElement;
            array[indexOfMinElement] = Integer.MAX_VALUE;
        }

        System.out.println();

        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }
}
