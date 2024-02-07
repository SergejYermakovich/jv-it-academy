package lesson19.lesson;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {

            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;

        };

        List<Callable<Integer>> callables = List.of(task, task, task);


        List<Future<Integer>> futures = executorService.invokeAll(callables);

        for (Future<Integer> future: futures) {
            System.out.println(future.get());
        }

        executorService.shutdown();

    }
}
