package functions;
import java.util.Scanner;


public void multiplyfun (String[] args){
    public int multiply(int number){
        for(int i=1;i<=10;i++){
            int p = i*number;
            System.out.println(number+ " * " +i + " = "+ p);
        } 
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table of:");
        int number = obj.nextInt(); 
        multiply(number);
    }
}
