package week_3;

class bankaccount {
    public int balance;

    public bankaccount(int amount){
        balance = amount;
    }

    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("Deposit: "+amount);
    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("withdrew: "+amount);
    }

    public void displaybalance(){
        System.out.println("Balance is :"+balance);
    }
}

class savingaccount extends bankaccount{

    public savingaccount(int amount){
        super(amount);
    }

    @Override
    public void withdraw(int amount){
        if(balance - amount >=100){
            balance= balance - amount;
            System.out.println("withdrew: "+amount);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        savingaccount m1= new savingaccount(500);

        m1.displaybalance();  
        m1.withdraw(450);   
        m1.withdraw(300);   
        m1.displaybalance();  
        m1.deposit(100);    
        m1.displaybalance();
    }
    
}