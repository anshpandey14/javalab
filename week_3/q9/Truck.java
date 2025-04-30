public class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 6.0; // km per liter (example)
    }

    @Override
    public int getMaxSpeed() {
        return 120; // km/h
    }
}
