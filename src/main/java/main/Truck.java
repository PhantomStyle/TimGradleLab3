package main;

public class Truck extends ExtendableVehicle {
    public Truck() {
        super();
    }

    public Truck(String mark, String model, double maxPermissibleMass, short numberOfPassengers, int maxSpeed) {
        super(mark, model, maxPermissibleMass, numberOfPassengers, maxSpeed);
    }

}
