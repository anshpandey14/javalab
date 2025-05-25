public class q8 {

    static int staticCounter;
    int instanceCounter;

    static {
        System.out.println("Static block executed.");
        staticCounter = 10;
    }

    public q8() {
        staticCounter++;
        instanceCounter++;
        System.out.println("Constructor executed.");
    }

    static void displayStaticCounter() {
        System.out.println("Static counter: " + staticCounter);
    }

    void displayInstanceCounter() {
        System.out.println("Instance counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        q8.displayStaticCounter();

        q8 obj1 = new q8();
        q8.displayStaticCounter();
        obj1.displayInstanceCounter();

        q8 obj2 = new q8();
        q8.displayStaticCounter();
        obj2.displayInstanceCounter();

        q8.displayStaticCounter();
    }
}
