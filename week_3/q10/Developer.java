public class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + ") performance: Very Good");
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is developing software modules and managing coding tasks.");
    }
}
