package lesson6;

public class SimpleSearch {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 5, 8, 7, 10, 9, -2, -9};

        int searchElement = -2;
        int searchElementIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                searchElementIndex = i;
            }
        }

        System.out.println("Search element: array[" + searchElementIndex  + "] is " + searchElement);

    }
}
