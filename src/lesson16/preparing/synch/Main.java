package lesson16.preparing.synch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new IncrementCounter(counter));
        Thread thread2 = new Thread(new IncrementCounter(counter));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter.getCount());
    }
}
