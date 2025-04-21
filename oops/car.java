public class car{
    String brand;   //instance variables - outside any class,block. 
    String model;   //instance variables
    int year;       //instance variables
        
     void displaydetails(){
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Model: "+model);
        System.out.println("Car year: "+year);
    }
    
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "Tata";
        c1.model = "Safari";
        c1.year = 2022;
        System.out.println("Car Details are: ");
        c1.displaydetails(); 
        
        car c2 = new car();
        c2.brand = "Suzuki";
        c2.model = "Alto";
        c2.year = 2019;
        System.out.println("Car Details are: ");
        c2.displaydetails();
    }
}