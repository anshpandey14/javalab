// package functions;
import java.util.Scanner;
public class multiplymain {
    public static void multiply(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+ " * " +i + " = "+ i*number);
        }
        obj.close();
    }
    public static void main(String[] args) {
        multiply();
    }
}
