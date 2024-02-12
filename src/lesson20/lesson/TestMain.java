package lesson20.lesson;

import java.util.concurrent.Semaphore;

public class TestMain {
    public static void main(String[] args) {
        // 1 permit
        Semaphore semaphore = new Semaphore(5, true);

        for (int i = 1; i < 10; i++) {
            Worker worker = new Worker(semaphore);
            new Thread(worker).start();
        }
    }

}
