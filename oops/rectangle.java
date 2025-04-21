public class rectangle {
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
    
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.length = 25;
        r.breadth = 50;
        int area = r.area();
        System.out.println("area is: "+area);
    }
}
