package lesson16.tasks;

public class Task3 {
    private static Object lock = new Object();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("Counter value: " + counter);
    }
}

