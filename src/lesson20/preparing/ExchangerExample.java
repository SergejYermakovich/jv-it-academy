package lesson20.preparing;

import java.util.Arrays;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    static final int BASE_ITERATIONS_NUMBER = 100;

    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();

        Thread thread1 = new Thread(() -> {
            try {

                int sum = 0;
                for (int i = 0; i < BASE_ITERATIONS_NUMBER / 2; i++) {
                    sum += i;
                }

                int exchangedData = exchanger.exchange(sum);
                System.out.println("Thread 1 received: " + exchangedData);
                System.out.println("Full sum in Thread 1 = " + (sum + exchangedData));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                int sum = 0;
                for (int i = BASE_ITERATIONS_NUMBER / 2; i < BASE_ITERATIONS_NUMBER; i++) {
                    sum += i;
                }
                int exchangedData = exchanger.exchange(sum);
                System.out.println("Thread 2 received: " + exchangedData);
                System.out.println("Full sum in Thread 2 = " + (sum + exchangedData));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
