import java.util.Scanner;
public class q2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = obj.nextLine();
        int length = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            else{
                length++;
            }
        }
        System.out.println("Characters in string are:"+length);
        boolean flag = false;
        for(int i = 0;i<n/2+1;i++){
            if(s.charAt(i) != s.charAt(n-i+1)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("String is palindromic string.");
        }
        else{
            System.out.println("String is not a palindromic string.");
        }
        for(int i=0;i<n/2+1;i++){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(n-i+1);
            char temp3 = s.charAt(i);
            temp1 = temp2;
            temp2 = temp3;
            //s.cahrAt(n-i+1) = temp;
        }
        System.out.println("Reversed String is: "+s);
        obj.close();
    }
}