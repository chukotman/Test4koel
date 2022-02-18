package hwork.lesson8a;

public class Vihicle {
    public int year;
    public String make;
    public String model;
    public Colors color;

    public void beep(){
        System.out.println(this.make + " " + this.model + "beeping");
    }

    public void printCar(){
        System.out.println("Year = " + this.year + "\nMake = " + make + "\nModel = " + model + "\nColor = " + color);

    }
}
