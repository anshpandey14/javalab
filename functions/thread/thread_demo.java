// import java.lang.*;

public class thread_demo{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread:" + t);
        t.setName("one");
        System.out.println("After changing the name:"+t);
        try{
            for(int n =5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Main thread interrupted");
        }

         
    }
}