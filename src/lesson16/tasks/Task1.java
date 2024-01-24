package lesson16.tasks;

public class Task1 {
    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {

            while (flag) {
            }
            System.out.println("Flag is now false");
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            flag = false;
        }).start();

    }
}
