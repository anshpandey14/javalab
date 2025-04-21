import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter size of the array:");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array numbers:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }
        int maxi = Integer.MIN_VALUE; 
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        System.out.println("Maximum and minimum elemts in the array are: "+maxi+" "+mini);
        obj.close();
    }
    
}
