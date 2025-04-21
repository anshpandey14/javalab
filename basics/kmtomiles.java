package basics;
import java.util.Scanner;
public class kmtomiles {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter distance in km");
        double km = obj.nextDouble();
        double miles = km*0.621;
        System.out.println("Distance in miles is:" + miles);
        obj.close();
    }
}
