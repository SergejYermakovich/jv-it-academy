package lesson16.tasks;

public class Task3 {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (lock1) {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lock2) {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("Counter value: " + counter);
    }
}

