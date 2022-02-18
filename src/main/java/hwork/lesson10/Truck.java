package hwork.lesson10;

public class Truck extends Vihicle{
    private double loadCapacity;

    public Truck(String name, int weight, int axleNumber, double loadCapacity) {
        super(name, weight, axleNumber);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTruckInfo(){
        return getInfo() + " - " +loadCapacity;
    }

    public void printTruckInfo(){
        System.out.println(getTruckInfo());
    }
}
