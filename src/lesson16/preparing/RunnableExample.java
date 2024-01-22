package lesson16.preparing;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableExample run: " + Thread.currentThread().getName());
    }
}
