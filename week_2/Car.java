public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;  
        this.year = year;    
    }

    public void displayDetails() {
        System.out.println("Car brand: " + this.brand);
        System.out.println("Car year: " + this.year);
    }

    public Car(String brand) {
        this(brand, 2020); 
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.displayDetails();

        Car car2 = new Car("Honda");
        car2.displayDetails();
    }
}
