public class statica {
    static int a = 1;
    static int show(){
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        statica.a = 5;
        int p = statica.show();
        System.out.println(a);
        System.out.println(p);
    }
}
