public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Smith", "123 Main St", 90000);
        Developer dev = new Developer("Bob Johnson", "456 Elm St", 70000);
        Programmer prog = new Programmer("Charlie Brown", "789 Oak St", 60000);

        System.out.println("Manager Info:");
        mgr.displayInfo();
        System.out.println("Bonus: $" + mgr.calculateBonus());
        mgr.generatePerformanceReport();
        mgr.manageProjects();

        System.out.println("\nDeveloper Info:");
        dev.displayInfo();
        System.out.println("Bonus: $" + dev.calculateBonus());
        dev.generatePerformanceReport();
        dev.manageProjects();

        System.out.println("\nProgrammer Info:");
        prog.displayInfo();
        System.out.println("Bonus: $" + prog.calculateBonus());
        prog.generatePerformanceReport();
        prog.manageProjects();
    }
}
