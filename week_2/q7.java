public class q7 {

    int id;
    String name;

    q7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        this.show();
        System.out.println("ID: " + id + ", Name: " + name);
    }

    void show() {
        System.out.println("Inside show() method");
    }

    q7 getObject() {
        return this;
    }

    public static void main(String[] args) {
        q7 obj = new q7(101, "Alice");
        obj.display();

        q7 returnedObj = obj.getObject();
        System.out.println("Returned Object HashCode: " + returnedObj.hashCode());
    }
}
