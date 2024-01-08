package lesson5.training;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 1, 3, 2, 4, 7, 6, 5, 8};
        for (int element : array) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            // swap
            int tempElement =  array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i] = tempElement;
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
