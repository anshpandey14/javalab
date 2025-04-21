public class thisa {
    public static void main(String[] args) {
        Test s1 = new Test();
        s1.setName = "Rahul";
        s1.displayname();
    }
}

class Test{
    public static void main(String[] args) {
        setName(String name);
        this.name = name;
    }
    void displayname(){
        System.out.println("name is: "+ this.name);
    }
}
