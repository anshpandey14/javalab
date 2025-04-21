import java.util.Scanner;
public class q2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = obj.nextLine();
        int n = s.length();
        System.out.println("Characters in string are:"+n);
        String reversed = "";
        for(int i = n-1;i>=0;i--){
            reversed += s.charAt(i); 
        }
        System.out.println("Reversed String is: "+reversed);
         if(s.equals(reversed)){
            System.out.println("String is palindromic string.");
        }
        else{
            System.out.println("String is not a palindromic string.");
        }
        obj.close();
    }
}