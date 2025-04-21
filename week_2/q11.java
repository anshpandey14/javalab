public class q11 {
   public static void main(String[] args) {
    int oddnumber = 0;
    int sum = 0;
    for(int i=1;i<=100;i++){
        if(i%2!=0){
            oddnumber++;
            sum = sum+i;
        }
    }
    System.out.println("Number of odd number is: "+oddnumber+" their sum is: "+sum);
   } 
}
