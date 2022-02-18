package lesson8;

public class Vehicle {
    public int year;
    public String make;
    public String model;
    public Colors color;

    public void beep(){
        System.out.println(this.make+" " + this.model+" beeping");
    }

    public void printMe(){
        System.out.println("Make = "+make);
        System.out.println("Model = "+model);
        System.out.println("Year = "+this.year);
        System.out.println("Color = "+this.color);
    }
}
