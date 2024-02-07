package lesson18.preparing.tasks.thread;

import java.util.Random;

public class ThreadExample {
    public static void main(String[] args) {
        int[] array = populateArray();

        FirstHalfCalculatorThread firstThread = new FirstHalfCalculatorThread(array);
        firstThread.start();

        SecondHalfCalculatorThread secondThread = new SecondHalfCalculatorThread(array);
        secondThread.start();


    }

    static int[] populateArray() {
        int[] array = new int[5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }
}
