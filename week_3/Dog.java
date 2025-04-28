package week_3;

public class Dog {
    private String name;
    private String breed;

    Dog(){

    }

    Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    String getname(){
        return this.name;
    }

    void setname(String name){
        this.name  = name;
    }

    String getbreed(){
        return this.breed;
    }

    void setbreed(String breed){
        this.breed = breed;
    }


    public static void main(String[] args) {
        Dog p1 = new Dog();
        p1.setname("Bravo");
        p1.setbreed("German Shepherd");

        System.out.println("name: "+ p1.getname());
        System.out.println("breed is: "+p1.getbreed());

        Dog p2 = new Dog("Tommy" , "Husky");
        System.out.println("name: "+ p2.getname());
        System.out.println("breed is: "+p2.getbreed());
    }
}
