class Employee {
    double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    double calculateSalary() {
        double baseSalary = 50000;
        double bonus = 20000;
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    double calculateSalary() {
        double baseSalary = 40000;
        double overtime = 10000;
        return baseSalary + overtime;
    }
}

public class q10 {
    public static void main(String[] args) {
        Employee e;

        e = new Manager();
        System.out.println("Manager Salary: " + e.calculateSalary());

        e = new Programmer();
        System.out.println("Programmer Salary: " + e.calculateSalary());
    }
}
