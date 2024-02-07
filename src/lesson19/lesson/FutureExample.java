package lesson19.lesson;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Future<?> result = executorService.submit(task);

        if (result.isDone()) {
            System.out.println(result.get());
        }

        for (;;) {
            if (result.isDone()) {
                System.out.println(result.get());
                break;
            } else {
                System.out.println("еще не выполнилось....");
            }
        }

        executorService.shutdown();

    }
}
