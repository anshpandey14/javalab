package week_3;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }

    Person(){
    }

    public static void main(String[] args) {

        new Person("adarsh" , 20);
        Person p1 = new Person();
        p1.name = "ansh";
        p1.age = 20;
        System.out.println("name is: "+p1.name);
        System.out.println("age is: "+p1.age);
    }
}