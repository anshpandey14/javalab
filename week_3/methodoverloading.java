package week_3;

public class methodoverloading {
    void add(int a,int b){
        System.out.println("sum: "+(a+b));
    }

    void add(int a,int b,int c){
        System.out.println("sum: "+(a+b+c));
    }

    void add(double a,double b,double c){
        System.out.println("sum :"+(a+b+c));
    }

    public static void main(String[] args) {
        methodoverloading n1 = new methodoverloading();
        n1.add(1, 2);
        n1.add(1, 3, 4);
        n1.add(3.5, 4.6, 9.3);
    }
}
