package hwork.lesson13.hwork;

import java.util.concurrent.LinkedBlockingDeque;

public class Vector {
    private int index;
    private double value;
    private double angle;
    private String name;

    public Vector(int index, double value, double angle, String name) {
        this.index = index;
        this.value = value;
        this.angle = angle;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printVectror(int index, double value, double angle, String name){
        System.out.println(index + " - " + value + " - " + angle + " - " + name);
    }
}
