package week_6;

class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) wait();
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) wait();
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try { buffer.produce(i); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try { buffer.consume(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        producer.start();
        consumer.start();
    }
}
