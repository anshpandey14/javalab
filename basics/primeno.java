package basics;
import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        int count = 0;
        for(int i = 2;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("Number is not a prime number:"+number);
        }
        else{
            System.out.println("Number is a prime number:"+number);
        }
        obj.close();
    }
    
}
