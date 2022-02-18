package lesson10;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int getArea(){
        return width*length;
    }
    public int getPerimeter(){
        return (width+length)*2;
    }
    public void draw(){
        System.out.println("I draw a rectangle with width = "+width+", length = "+length);
    }

    public int getWidth() {
        return width;
    }
}
