package basics;
import java.util.Scanner;
public class swap {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = obj.nextInt();
        System.out.println("Enter Second number:" );
        int b = obj.nextInt();
        System.out.println("Swapped numbers are: ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
        obj.close();
    }
} 