import java.util.Scanner;
public class multiply{
    public static void main(String[] str){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table of:");
        int number = obj.nextInt();
        for(int i =1;i<=10;i++){
            int p = number*i;
            System.out.println(number+ " * " +i + " = "+ p);
        }
        obj.close();
    }
    
}
