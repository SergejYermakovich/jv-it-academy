package lesson5.training;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 10, 12};
        int searchElement = 12;


        int start = 0, end = array.length - 1;
        int mediumIndex = 0;
        while (start <= end) {
            mediumIndex = (start + end) / 2;
            if (array[mediumIndex] > searchElement) {
                end = mediumIndex - 1;
            }

            if (array[mediumIndex] < searchElement) {
                start = mediumIndex + 1;
            }

            if (array[mediumIndex] == searchElement) break;
        }

        System.out.println("medium index = " + mediumIndex);
    }
}
