// package basics;
import java.util.Scanner;
public class simpleinterest{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter principal amount");
        double p = obj.nextDouble();
        System.out.println("Enter rate of interest");
        double rate = obj.nextDouble();
        System.out.println("Enter time period");
        double t = obj.nextDouble();
        double SI = (p*rate*t)/100;
        System.out.println("Simple interset (SI) = " + SI);
        obj.close();
    }
}