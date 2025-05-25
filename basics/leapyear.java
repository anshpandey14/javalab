// package basics;
import java.util.Scanner;
public class leapyear{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = obj.nextInt();
        if(year%400 == 0){
            System.out.println("Year is leap year:"+year);
        }
        else if(year%100 == 0){
            System.out.println("Year is not a leap year:"+year);
        }
        else if(year % 4 == 0){
            System.out.println("Year is a leap year:"+year);
        }
        else{
            System.out.println("Year is not a leap year:"+year);
        }
        obj.close();
    }
}