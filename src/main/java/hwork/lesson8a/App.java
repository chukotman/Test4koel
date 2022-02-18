package hwork.lesson8a;

public class App {
    public static void main(String[] args) {
//        Person david = new Person();
//        david.year = 1995;
//        david.name = "David";
//        david.lastName = "Hamilton";
//        david.printName();
//
//        System.out.println();

        Person anna = new Person();
        anna.year = 1996;
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.printName();

        System.out.println();
//
//        Person alex = new Person();
//        alex.year = 1986;
//        alex.name = "Alexander";
//        alex.lastName = "Peterson";
//        alex.printName();
//
//        System.out.println();;

        Vihicle myCar = new Vihicle();
        myCar.year = 2015;
        myCar.make = "Toyota";
        myCar.model = "Prius";
        myCar.color = Colors.BLACK;

        myCar.printCar();

        Vihicle alexCar = new Vihicle();
        alexCar.model = "Odessey";
        alexCar.make = "Honada";

        alexCar.beep();
        myCar.beep();

        alexCar.printCar();

    }
}
