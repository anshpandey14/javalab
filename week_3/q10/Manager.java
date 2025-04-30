public class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + ") performance: Excellent");
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is managing multiple departments and strategic projects.");
    }
}
