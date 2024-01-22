package lesson16.preparing.notSynchronizedEx;

public class NotSynchronizedTest {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new IncrementCounter());
        Thread thread2 = new Thread(new IncrementCounter());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter);
    }

    static class IncrementCounter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {

            synchronized (IncrementCounter.class) {
                counter++;
            }


            }
        }
    }
}
