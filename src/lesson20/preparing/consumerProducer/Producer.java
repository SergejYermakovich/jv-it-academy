package lesson20.preparing.consumerProducer;

import lesson20.preparing.consumerProducer.Buffer;

public class Producer implements Runnable {

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0;  ; i++) {
            System.out.println(Thread.currentThread().getName() + " puts " + i);
            buffer.put();
        }
    }
}
