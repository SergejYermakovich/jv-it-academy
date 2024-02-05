package lesson19.preparing.executorService;

public class Worker implements Runnable {

    private final int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Work with id = " + id + " is completed");
    }
}
