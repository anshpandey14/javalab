// package functions;
import java.util.Scanner;
public class oddsum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int number = obj.nextInt();
        int sum = 0;
        for(int i=0;i<=number;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("Sum is: "+sum);
        obj.close();
    }
}
