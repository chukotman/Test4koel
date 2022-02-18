package lesson10;

public class App1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.draw();

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square.draw();


        String name = new String("Anna");
    }
}
