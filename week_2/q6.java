import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int max = 0;
        int p  = 3;
        while(p>0){
            System.out.println("Enter "+(4-p) +" number: ");
            int num = obj.nextInt();
            if(num>max){
                max = num;
            }
            p--;
        }
        System.out.println("Maximum Number is: "+max);
        obj.close();
    }
    
}
