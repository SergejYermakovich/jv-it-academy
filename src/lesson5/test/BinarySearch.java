package lesson5.test;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 10, 12};

        int searchElement = 10;
        int start = 0, end = array.length - 1;
        int middleElementIndex = 0;
        while (start <= end) {
              middleElementIndex = (start + end) / 2;

            if (array[middleElementIndex] == searchElement) break;
            if (array[middleElementIndex] > searchElement) {
                end = middleElementIndex - 1;
            } else if (array[middleElementIndex] < searchElement) {
                start = middleElementIndex + 1;
            }

        }

        System.out.println("array[" + middleElementIndex   + "] = " + array[middleElementIndex]);

    }
}
