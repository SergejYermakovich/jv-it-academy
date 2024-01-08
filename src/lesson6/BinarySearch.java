package lesson6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 23, 45, 4566, 34555};
        int searchedElement = 45;

        int start = 0;
        int end = array.length - 1;


        while (start <= end) {
            int medium = (start + end) / 2;

            if (searchedElement > array[medium]) {
                start = medium + 1;
            }

            if (searchedElement < array[medium]) {
                end = medium - 1;
            }

            if (searchedElement == array[medium]) {
                System.out.println("Search element: array[" + medium + "] is " + array[medium]);
                break;
            }
        }

    }
}
