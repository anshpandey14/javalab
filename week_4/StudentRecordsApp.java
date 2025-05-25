import java.io.*;
import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    String department;
    double cgpa;

    public Student(String name, String rollNo, String department, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return name + "," + rollNo + "," + department + "," + cgpa;
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 4) {
            return new Student(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]));
        }
        return null;
    }
}

public class StudentRecordsApp {
    private static final String FILE_NAME = "students.txt";

    // Add a new student to the file
    public static void addStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.toString());
            writer.newLine();
            System.out.println("Student added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read and display all students
    public static void displayAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("All Students:");
            while ((line = reader.readLine()) != null) {
                Student student = Student.fromString(line);
                if (student != null) {
                    System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo +
                            ", Dept: " + student.department + ", CGPA: " + student.cgpa);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. No records to display.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Search for a student by roll number
    public static void searchByRollNumber(String rollNo) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student student = Student.fromString(line);
                if (student != null && student.rollNo.equalsIgnoreCase(rollNo)) {
                    System.out.println("Student Found:");
                    System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo +
                            ", Dept: " + student.department + ", CGPA: " + student.cgpa);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with roll number " + rollNo + " not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. No records exist.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Menu-driven interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nStudent Records Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                    String rollNo = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();
                    scanner.nextLine();
                    addStudent(new Student(name, rollNo, dept, cgpa));
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    String searchRollNo = scanner.nextLine();
                    searchByRollNumber(searchRollNo);
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        scanner.close();
    }
}
