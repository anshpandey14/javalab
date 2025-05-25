// package basics;
import java.util.Scanner;
public class userinput{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = obj.nextLine();
        System.out.println("Name is:" + name);
        System.out.println("Enter age");
        int age = obj.nextInt();
        System.out.println("Age is:"+age);
        obj.close();
    }
}