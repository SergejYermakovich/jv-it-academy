package lesson20.preparing;

public class Buffer {
    private int messageCount = 0;
    public synchronized void get() {
        while (messageCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) { /* ... */ }
        }
        messageCount--;
        notifyAll();
    }
    public synchronized void put() {
        while (messageCount >= 3) {
            try {
                wait();
            } catch (InterruptedException e) { /* ... */ }
        }
        messageCount++;
        notifyAll();
    }
}
