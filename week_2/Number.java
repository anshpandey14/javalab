import java.util.Scanner;
class Number{

    private double num;

    public Number(double num) {
        this.num = num;
    }
    
    Boolean isZero(){
        if(this.num == 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isPositive(){
        if(num > 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isNegative(){
        if(num < 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isOdd(){
        if(num%2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isEven(){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isPrime(){
        for(int i =2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    Boolean isArmstrong(){
        int n = (int) this.num; 
        int sum = 0, temp = n, digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = obj.nextDouble();
        Number n1 = new Number(n);
        System.out.println("Number is zero: "+n1.isZero());
        System.out.println("Number is positive: "+n1.isPositive());
        System.out.println("Number is negative: "+n1.isNegative());
        System.out.println("Number is odd: "+n1.isOdd());
        System.out.println("Number is even: "+n1.isEven());
        System.out.println("Number is prime: "+n1.isPrime());
        System.out.println("Number is Armstrong: "+n1.isArmstrong());
        obj.close();
    }
}
