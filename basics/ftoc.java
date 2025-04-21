package basics;
import java.util.Scanner;
public class ftoc{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenhiet:");
        double f = obj.nextDouble();
        double c = ((f-32)*5)/9;
        System.out.println("Temperature in celsius is:"+c);
        obj.close();
    }
}