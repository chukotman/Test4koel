package hwork.oop;

public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }
    @Override
    public void draw(){
        System.out.println("I draw a Square with s = " + getLength());
    }
}
