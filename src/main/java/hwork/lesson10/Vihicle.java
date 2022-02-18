package hwork.lesson10;

public class Vihicle {
    private String name;
    private int weight;
    private int axleNumber;

    public Vihicle(String name, int weight, int axleNumber) {
        this.name = name;
        this.weight = weight;
        this.axleNumber = axleNumber;
    }

    public Vihicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAxleNumber() {
        return axleNumber;
    }

    public void setAxleNumber(int axleNumber) {
        this.axleNumber = axleNumber;
    }


    public String getInfo(){
        return name + " - " + weight + " - " + axleNumber;
    }

    public void printInfo(){
        System.out.println(getInfo());
        }
}
