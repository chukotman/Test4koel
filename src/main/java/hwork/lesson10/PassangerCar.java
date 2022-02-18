package hwork.lesson10;

public class PassangerCar extends Vihicle{
    private int setsNumber;

    public PassangerCar(String name, int weight, int axleNumber, int setsNumber) {
        super(name, weight, axleNumber);
        this.setsNumber = setsNumber;
    }

    public int getSetsNumber() {
        return setsNumber;
    }

    public void setSetsNumber(int setsNumber) {
        this.setsNumber = setsNumber;
    }

    public String getCarInfo(){
        return getInfo() + " - " +setsNumber;
    }

    public void printCarInfo(){
        System.out.println(getCarInfo());
    }
}
