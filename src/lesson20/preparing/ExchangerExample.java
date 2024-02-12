package lesson20.preparing;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread thread1 = new Thread(() -> {
            try {
                String data1 = "Data from thread 1";
                System.out.println("Thread 1 has data: " + data1);
                String exchangedData = exchanger.exchange(data1);
                System.out.println("Thread 1 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                String data2 = "Data from thread 2";
                System.out.println("Thread 2 has data: " + data2);
                String exchangedData = exchanger.exchange(data2);
                System.out.println("Thread 2 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
