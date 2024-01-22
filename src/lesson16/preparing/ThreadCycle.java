package lesson16.preparing;

public class ThreadCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadExample();
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        thread.join();
        System.out.println(thread.getState());
    }
}
