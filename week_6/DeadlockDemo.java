package week_6;

public class DeadlockDemo {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock1...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock2...");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock2...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock1...");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockDemo deadlock = new DeadlockDemo();
        Thread t1 = new Thread(() -> deadlock.method1());
        Thread t2 = new Thread(() -> deadlock.method2());

        t1.start();
        t2.start();
    }
}
