package lesson16.tasks;

public class Task1 {
    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                System.out.println("loop...");
            }
            System.out.println("Flag is now false");
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            System.out.println("flag is false");
            flag = false;
        }).start();

    }
}
