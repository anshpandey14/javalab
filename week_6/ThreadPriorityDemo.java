package week_6;

class ThreadPriorityDemo extends Thread {
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " count: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();

        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
