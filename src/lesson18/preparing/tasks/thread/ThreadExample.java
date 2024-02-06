package lesson18.preparing.tasks.thread;

import java.util.Random;

public class ThreadExample {
    public static void main(String[] args) {
        int[] array = populateArray();


        FirstHalfCalculatorThread firstHalfCalculatorThread = new FirstHalfCalculatorThread(array);
        firstHalfCalculatorThread.start();


    }

    static int[] populateArray() {
        int[] array = new int[10000000];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
