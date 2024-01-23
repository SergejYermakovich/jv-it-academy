package lesson16.preparing.synch;

public class IncrementCounter implements Runnable {
    private Counter counter;

    public IncrementCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increment();
        }
    }
}