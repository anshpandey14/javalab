package arrays;
import java.util.Scanner;
public class elementfound {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = obj.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element needs to be found");
        int number = obj.nextInt();
        System.out.println("Enter the elements of the array");
        boolean found = false;
        for(int i=0;i<size;i++){
            int p = obj.nextInt();
            a[i] = p;
        }
        for(int i=0;i<size;i++){
            if(a[i] == number){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Not found");
        }
        obj.close();
    }
}
