package lesson16.preparing;

public class WaitExample {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        System.out.println("Thread 1 is waiting");
                        lock.wait(); // по  ток ожидает вызова notify()
                        System.out.println("Thread 1 is awake");
                    } catch (InterruptedException ignored) {

                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Thread 2 is running");
                    lock.notify(); // вызываем notify(), чтобы разбудить поток t1
                }
            }
        });

        t1.start();
        Thread.sleep(1000); // ждем 1 секунду, чтобы убедиться, что поток t1 начал ожидание
        t2.start();
    }
}
