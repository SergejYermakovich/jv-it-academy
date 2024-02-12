package lesson20.preparing;

import lesson20.preparing.consumerProducer.Buffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(
                new Consumer(buffer)
        );

        executorService.execute(
                new Producer(buffer)
        );
    }
}
