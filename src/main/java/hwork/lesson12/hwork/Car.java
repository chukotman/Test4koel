package hwork.lesson12.hwork;

public class Car implements Calculator {
     private double wheelMass;
     private int wheelQuantity;
     private double bodyMass;

    public Car(double wheelMass, int wheelQuantity, double bodyMass) {
        this.wheelMass = wheelMass;
        this.wheelQuantity = wheelQuantity;
        this.bodyMass = bodyMass;
    }

    public double getWheelMass() {
        return wheelMass;
    }

    public int getWheelQuantity() {
        return wheelQuantity;
    }

    public double getBodyMass() {
        return bodyMass;
    }


    @Override
    public void totalMass() {
        double totalMass = (getWheelMass()*getWheelMass()) + getBodyMass();
        System.out.println("Total Car Mass is " + totalMass);
    }
}
