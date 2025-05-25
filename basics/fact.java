// packaics;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        if(number<1){
            System.out.println("Number is negative, factorial is not defined.");
        }
        else{
            int fact = 1;
            for(int i = 1;i<=number;i++){
                fact = fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
        obj.close();
    }
    
}
