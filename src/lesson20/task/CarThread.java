package lesson20.task;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class CarThread extends Thread {

    private Car car;
    private Semaphore semaphore;

    private Exchanger<String> exchanger;

    public CarThread(Car car, Semaphore semaphore, Exchanger<String> exchanger) {
        this.car = car;
        this.semaphore = semaphore;
        this.exchanger = exchanger;

    }

    @Override
    public void run() {
        System.out.println("Машина с " + car.getId() + " подъехала к парковке.");
        try {
            semaphore.acquire();

            System.out.println("Машина с " + car.getId() + " заехала на парковку.");
            System.out.println(exchanger.exchange("Bip bip from car " + car.getId()));

            Thread.sleep(5000);
            semaphore.release();
            System.out.println("Машина с " + car.getId() + " уехала с парковки.");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
