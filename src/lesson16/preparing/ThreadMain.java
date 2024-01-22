package lesson16.preparing;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread test1 = new ThreadExample();
        test1.start();
        test1.join();

        RunnableExample runnableExample = new RunnableExample();
        Thread test2 = new Thread(runnableExample);
        test2.start();
        test2.join();

        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
