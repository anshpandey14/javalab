public class thisa {
    public static void main(String[] args) {
        Test s1 = new Test();
        s1.setName("Rahul");
        s1.displayName();
    }
}

class Test {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name is: " + this.name);
    }
}
