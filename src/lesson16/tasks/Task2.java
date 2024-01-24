package lesson16.tasks;


public class Task2 {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter++;
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter++;
            }
        }).start();

        Thread.sleep(2000);
        System.out.println("Counter value: " + counter);
    }
}
