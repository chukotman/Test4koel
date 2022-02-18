package hwork.lesson12.hwork;

public class Truck extends Car{
    private double cargoMass;

    public Truck(double wheelMass, int wheelQuantity, double bodyMass, double cargoMass) {
        super(wheelMass, wheelQuantity, bodyMass);
        this.cargoMass = cargoMass;
    }

    public double getCargoMass() {
        return cargoMass;
    }

    @Override
    public void totalMass() {
        double totalMass = (getWheelMass()*getWheelMass()) + getBodyMass() + getCargoMass();
        System.out.println("Total Truck Mass w/cargo is " + totalMass);
    }
}
