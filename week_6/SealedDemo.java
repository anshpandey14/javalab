package week_6;

abstract sealed class Vehicle permits Car, Truck {
    abstract void drive();
}

final class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car.");
    }
}

final class Truck extends Vehicle {
    void drive() {
        System.out.println("Driving a truck.");
    }
}

public class SealedDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();
        v1.drive();
        v2.drive();
    }
}
