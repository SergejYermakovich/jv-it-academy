package lesson16.preparing.waitAndNotify;

import java.util.Arrays;
import java.util.Random;

public class WaitExample {
    public static void main(String[] args) throws InterruptedException {

        final int[] buffer = new int[5];


        final Random random = new Random();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (buffer) {
                    try {
                        System.out.println("Thread 1 is waiting");
                        buffer.wait(); // поток ожидает вызова notify()
                        System.out.println("Thread 1 is awake");
                    } catch (InterruptedException ignored) {

                    }
                }

                System.out.println("Thread 1:");
                System.out.println(Arrays.toString(buffer));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (buffer) {
                    System.out.println("Thread 2 is running");

                    for (int i = 0; i < buffer.length; i++) {
                        buffer[i] = random.nextInt(10);
                    }


                    System.out.println("Thread 2 is notifying....");
                    buffer.notify(); // вызываем notify(), чтобы разбудить поток t1
                }
            }
        });

        t1.start();
        Thread.sleep(1000); // ждем 1 секунду, чтобы убедиться, что поток t1 начал ожидание
        t2.start();
    }
}
