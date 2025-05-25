import java.io.*;
import java.util.*;

class BookIssue implements Serializable {
    private static final long serialVersionUID = 1L;

    String bookId;
    String bookName;
    String memberId;
    String issueDate;
    String returnDate;

    public BookIssue(String bookId, String bookName, String memberId, String issueDate, String returnDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName +
                ", Member ID: " + memberId + ", Issue Date: " + issueDate +
                ", Return Date: " + returnDate;
    }
}

public class LibraryTrackerApp {
    private static final String FILE_NAME = "book_issues.dat";

    // Add a new book issue record
    public static void addBookIssue(BookIssue issue) {
        List<BookIssue> records = readAllIssues();
        records.add(issue);
        writeAllIssues(records);
        System.out.println("Book issue record added.");
    }

    // Read all issue records
    @SuppressWarnings("unchecked")
	public static List<BookIssue> readAllIssues() {
        List<BookIssue> issues = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            issues = (List<BookIssue>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File might not exist initially — no action needed
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return issues;
    }

    // Write all issue records (used to update file)
    public static void writeAllIssues(List<BookIssue> issues) {
        // Write to a temp file first to ensure data consistency
        File tempFile = new File("temp_" + FILE_NAME);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tempFile))) {
            oos.writeObject(issues);
            oos.flush();

            // Replace original file with temp file
            File originalFile = new File(FILE_NAME);
            if (originalFile.exists()) {
                originalFile.delete();
            }
            tempFile.renameTo(originalFile);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Display all book issue records
    public static void displayAllIssues() {
        List<BookIssue> records = readAllIssues();
        if (records.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (BookIssue record : records) {
                System.out.println(record);
            }
        }
    }

    // Update return date for a specific book ID and member ID
    public static void updateReturnDate(String bookId, String memberId, String newReturnDate) {
        List<BookIssue> records = readAllIssues();
        boolean updated = false;
        for (BookIssue issue : records) {
            if (issue.bookId.equals(bookId) && issue.memberId.equals(memberId)) {
                issue.returnDate = newReturnDate;
                updated = true;
                break;
            }
        }
        if (updated) {
            writeAllIssues(records);
            System.out.println("Return date updated.");
        } else {
            System.out.println("Record not found.");
        }
    }

    // Menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Book Issue Tracker");
            System.out.println("1. Add Book Issue Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Update Return Date");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt(); scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Issue Date (dd-mm-yyyy): ");
                    String issueDate = scanner.nextLine();
                    System.out.print("Enter Return Date (dd-mm-yyyy): ");
                    String returnDate = scanner.nextLine();
                    addBookIssue(new BookIssue(bookId, bookName, memberId, issueDate, returnDate));
                    break;

                case 2:
                    displayAllIssues();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    String bId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String mId = scanner.nextLine();
                    System.out.print("Enter New Return Date (dd-mm-yyyy): ");
                    String newReturn = scanner.nextLine();
                    updateReturnDate(bId, mId, newReturn);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
