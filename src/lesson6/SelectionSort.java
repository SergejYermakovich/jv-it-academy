package lesson6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 5, 8, 7, 10, 9, -2, -9};



        System.out.println("Before:");
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
            int temp = array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i] = temp;
        }


        System.out.println();
        System.out.println("After:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
