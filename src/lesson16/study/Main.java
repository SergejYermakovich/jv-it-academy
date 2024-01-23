package lesson16.study;

public class Main {
    public static void main(String[] args)   {
        ThreadExample thread1 = new ThreadExample();
        thread1.start();


        Runnable threadRunnableExample = new ThreadRunnableExample();
        Thread thread2 = new Thread(threadRunnableExample, "threadRunnable name");
        thread2.start();



        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
