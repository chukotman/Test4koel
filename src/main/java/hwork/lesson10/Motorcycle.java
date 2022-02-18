package hwork.lesson10;

public class Motorcycle extends Vihicle{
    private BikeType bikeType;

    public Motorcycle(String name, int weight, int axleNumber, BikeType bikeType) {
        super(name, weight, axleNumber);
        this.bikeType = bikeType;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeInfo(){
        return getInfo() + " - " + bikeType;
    }

    public void printBikeInfo(){
        System.out.println(getBikeInfo());
    }
}
