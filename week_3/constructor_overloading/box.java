package week_3.constructor_overloading;
public class box {
    int length;
    int width;
    int height;   

    box(){
        this.length=this.width=this.height=0;
    }

    box(int l){
        this.length=l;
        this.width=this.height=0;
    }

    box(int l,int b,int h){
        this.length = l;
        this.width = b;
        this.height = h;
    }

    void display(){
        System.out.println("length is: "+length+" width is: "+width+" height is: "+height);
    }

    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(2);
        box b3 = new box(1,2,3);
        b1.display();
        b2.display();
        b3.display();
    }
}
