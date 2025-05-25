// package functions;
import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        int sum = 0;
        int p = number;
        while(p>0){
            int q = p%10;
            sum = sum+q;
            p=p/10;
        }
        System.out.println("Sum of digit is: "+sum);
        obj.close();
    }
}
