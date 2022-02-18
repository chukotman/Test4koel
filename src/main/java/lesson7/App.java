package lesson7;

public class App {
    public static void main(String[] args) {
        Colors ball = Colors.BLUE;

        String ball1 = "BLUE";
        String ball2 = "Blue";
        String ball3 = "blue";


//        Colors ball4 = Colors.BLACK;

        SchoolType highlandMiddle = SchoolType.PUBLIC;
        SchoolType monsTrosso = SchoolType.PRIVATE;


        Sizes tshirt = Sizes.XL;
        tshirt = Sizes.S;
        System.out.println(tshirt);
        System.out.println(monsTrosso);
        System.out.println(ball);
    }
}
