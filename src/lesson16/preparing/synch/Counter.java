package lesson16.preparing.synch;

public class Counter {
    private int count;

    public void increment() {
        synchronized (Counter.class) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
