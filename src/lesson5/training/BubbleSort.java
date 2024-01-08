package lesson5.training;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 1, 3, 2, 4, 7, 6, 5, 8};
        System.out.println("Before: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        boolean needIteration = true;
        int counter = 0;

        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    needIteration = true;
                }
            }

            counter++;
        }

        System.out.println("\nAfter: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("counter: " + counter);

    }
}
