package lesson16.preparing;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("ThreadExample: " + Thread.currentThread().getName());
    }
}
