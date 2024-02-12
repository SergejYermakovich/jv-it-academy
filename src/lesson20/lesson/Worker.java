package lesson20.lesson;

import java.util.concurrent.Semaphore;

class Worker implements Runnable {
    private Semaphore semaphore;

    Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            //acquire acceptance

            semaphore.acquire();

            System.out.println("Worker " + Thread.currentThread().getName() + " is working.");
            Thread.sleep(3000);

            //release acceptance
            semaphore.release();

        } catch (InterruptedException e) {
            /* ... */
        }
    }
}
