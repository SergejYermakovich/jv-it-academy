package lesson20.preparing;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2); // создаем семафор с 2 разрешениями

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // захватываем разрешение
                System.out.println("Thread 1 is working");
                Thread.sleep(2000);
                semaphore.release(); // освобождаем разрешение
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // захватываем разрешение
                System.out.println("Thread 2 is working");
                Thread.sleep(2000);
                semaphore.release(); // освобождаем разрешение
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

    }
}
