package lesson9;

public class Vehicle {
    private int year;
    private String make;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

}
