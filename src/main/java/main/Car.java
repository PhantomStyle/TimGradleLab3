package main;

public class Car extends ExtendableVehicle {
    public Car() {
        super();
    }

    public Car(String mark, String model, double maxPermissibleMass, short numberOfPassengers, int maxSpeed) {
        super(mark, model, maxPermissibleMass, numberOfPassengers, maxSpeed);
    }

}
