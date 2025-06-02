// MyThread.java
class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        // Run method logic
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

public class MyThreadProgram {
    public static void main(String[] args) {
        MyThread runnable1 = new MyThread("Thread-1");
        MyThread runnable2 = new MyThread("Thread-2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
