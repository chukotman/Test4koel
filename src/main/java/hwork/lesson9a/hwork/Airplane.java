package hwork.lesson9a.hwork;

public class Airplane {
    private String model;
    private int passengerQuantity;
    private int cruiseTime;

    public Airplane(String model, int passengerQuantity, int cruiseTime){
        this.model = model;
        this.passengerQuantity = passengerQuantity;
        this.cruiseTime = cruiseTime;
    }

    public Airplane(String model, int passengerQuantity){
        this.model = model;
        this.passengerQuantity = passengerQuantity;
    }

    public Airplane(String model){
        this.model = model;
    }

    public Airplane(){};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public int getCruiseTime() {
        return cruiseTime;
    }

    public void setCruiseTime(int cruiseTime) {
        this.cruiseTime = cruiseTime;
    }

    public void printAirplane(){
        System.out.println(getModel() + " - " + getPassengerQuantity() + " passangers - " + getCruiseTime() + " hours");
        System.out.println();
    }
}
