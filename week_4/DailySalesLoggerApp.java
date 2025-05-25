import java.io.*;
import java.util.*;

public class DailySalesLoggerApp {
    private static final String FILE_NAME = "sales_log.txt";

    // Add a new sales transaction to the file (append mode)
    public static void appendTransaction(String itemName, int quantity, double price, String date) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String record = itemName + "," + quantity + "," + price + "," + date;
            writer.write(record);
            writer.newLine();
            System.out.println("Transaction logged successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Summarize total sales for a given date
    public static void summarizeSalesForDate(String targetDate) {
        double totalSales = 0.0;
        int malformedCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    if (parts.length != 4) {
                        throw new IllegalArgumentException("Invalid record format");
                    }

                    // String item = parts[0].trim();
                    int quantity = Integer.parseInt(parts[1].trim());
                    double price = Double.parseDouble(parts[2].trim());
                    String date = parts[3].trim();

                    if (date.equals(targetDate)) {
                        totalSales += quantity * price;
                    }

                } catch (Exception e) {
                    malformedCount++;
                    // Continue reading other lines
                }
            }

            System.out.printf("Total sales on %s: $%.2f\n", targetDate, totalSales);
            if (malformedCount > 0) {
                System.out.println("Ignored malformed entries: " + malformedCount);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Sales file not found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Daily Sales Logger ---");
            System.out.println("1. Add New Sale");
            System.out.println("2. View Total Sales by Date");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity sold: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price per item: ");
                    double price = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    appendTransaction(itemName, quantity, price, date);
                    break;

                case 2:
                    System.out.print("Enter date to summarize (YYYY-MM-DD): ");
                    String summaryDate = scanner.nextLine();
                    summarizeSalesForDate(summaryDate);
                    break;

                case 3:
                    System.out.println("Exiting. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
