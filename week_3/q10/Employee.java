public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05; // base bonus
    }

    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + ") performance: Satisfactory");
    }

    public void manageProjects() {
        System.out.println(name + " is assigned to general tasks.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}
