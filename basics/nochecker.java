// package basics;
import java.util.Scanner;
public class nochecker{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = obj.nextDouble();
        if(number>0){
            System.out.println("Positive number");
        }
        else if(number<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
        obj.close();
    }
}