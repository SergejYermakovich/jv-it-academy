package lesson18.preparing.tasks.thread;

import java.util.concurrent.TimeUnit;

public class NonThreadExample {
    public static void main(String[] args) {
        int[] array = ThreadExample.populateArray();


        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Операция заняла:" + (end - start));
        System.out.println(sum);
    }
}
