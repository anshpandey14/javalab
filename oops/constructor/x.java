public class x{
    x(){
        System.out.println("No parameter");
    }
    x(int a){
        System.out.println(a);
    }
    x(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args){
        System.out.println("let's start.");
        x x1 =new x(3);
        new x();
        new x(0.05f);
    }
} 