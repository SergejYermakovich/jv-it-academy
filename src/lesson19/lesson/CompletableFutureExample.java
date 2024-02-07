package lesson19.lesson;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture.supplyAsync(() -> new Order("наушники"), executorService)
                .thenApply(order -> createOrder(order))
                .thenAccept(order -> processOrder((Order) order));
    }

    private static Order processOrder(Order order) {

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        order.setStatus("PROCESSING");

        return order;
    }

    private static Object createOrder(Order order) {
        System.out.println(Thread.currentThread().getName());
        order.setStatus("CREATED");
        return order;
    }


    static class Order {
        private String name;

        private String status;

        public Order(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
