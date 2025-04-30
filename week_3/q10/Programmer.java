public class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + ") performance: Good");
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is writing code and debugging software.");
    }
}
