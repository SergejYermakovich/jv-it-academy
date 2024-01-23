package lesson16.preparing;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread test1 = new ThreadExample();

        RunnableExample runnableExample = new RunnableExample();
        Thread test2 = new Thread(runnableExample);

    }
}
