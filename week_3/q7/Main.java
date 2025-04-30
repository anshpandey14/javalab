public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Johnson", "E123", "Software Engineer");

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName()); // includes job title
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
