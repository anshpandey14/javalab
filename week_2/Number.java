import java.util.Scanner;
class Number{

    int number;
    
    Boolean isZero(){
        if(this.number == 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isPositive(){
        if(number > 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isNegative(){
        if(number < 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isOdd(){
        if(number%2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isEven(){
        if(number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    Boolean isPrime(){
        for(int i =2;i<=number/2;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    // Boolean isArmstrong(){

    // }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Number n1 = new Number();
        System.out.println("Enter a number");
        n1.number = obj.nextInt();
        System.out.println("Number is zero: "+n1.isZero());
        System.out.println("Number is positive: "+n1.isPositive());
        System.out.println("Number is negative: "+n1.isNegative());
        System.out.println("Number is odd: "+n1.isOdd());
        System.out.println("Number is even: "+n1.isEven());
        System.out.println("Number is prime: "+n1.isPrime());
        // System.out.println("Number is Armstrong: +n1.isArmstrong()");
        obj.close();
    }
}
