package lesson20.preparing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(
                new Consumer(buffer)
        );

        executorService.execute(
                new Producer(buffer)
        );
    }
}
