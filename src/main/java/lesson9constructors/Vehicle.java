package lesson9constructors;

public class Vehicle {
    private int year;
    private String make;
    private String model;
    private String color;

    public Vehicle(){}

    public Vehicle(int year,String make,String model,String color){
        this.make=make;
        this.color=color;
        this.model=model;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
