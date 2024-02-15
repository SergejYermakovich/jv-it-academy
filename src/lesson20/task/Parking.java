package lesson20.task;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Parking {
    static final int PARKING_PLACES = 2;
    static Semaphore semaphore = new Semaphore(PARKING_PLACES, true);

    static Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; ; i++) {
            new CarThread(new Car(i), semaphore, exchanger).start();
            Thread.sleep(1000);
        }


    }
}
