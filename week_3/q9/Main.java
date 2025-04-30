public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FH16", 2022, "Diesel");
        Car car = new Car("Toyota", "Camry", 2023, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 2021, "Petrol");

        System.out.println("Truck Info:");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L: " + truck.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        System.out.println("Car Info:");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L: " + car.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L: " + motorcycle.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}
