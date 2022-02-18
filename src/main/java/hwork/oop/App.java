package hwork.oop;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Shape c2 = new Circle(7);

//        Shape shape = new Shape();

        Rectangle r1 = new Rectangle(5,9);
        Shape r2 = new Rectangle(3,8);

        Square s1 = new Square(5);
        Rectangle s2 = new Square(7);
        Shape s3 = new Square(9);

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3};

        for (Shape shape: shapes){
            shape.draw();
        }

        double area = 0;
        for (Shape shape: shapes){
            area = area + shape.getArea();
        }
        System.out.println("Total area = "+area);




    }
}
