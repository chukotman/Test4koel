package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1998;

        Person david = new Person();
        david.year = 1995;
        david.name = "David";
        david.lastName = "Jonson";
        david.year = 1999;


//        System.out.println(anna.name);
//        System.out.println(anna.lastName);

        Person alex = new Person();
        alex.year = 1995;
        alex.name = "Alexander";
        alex.lastName= "Peters";

        Person xx = new Person();
        xx.lastName = "Jameson";
        xx.name = "Mary";
        xx.year = 2001;


//        System.out.println(xx);

        Vehicle myCar = new Vehicle();
        myCar.color = Colors.PINK;
        myCar.make = "Toyota";
        myCar.model = "Prius";
        myCar.year = 2001;

        Vehicle alexCar = new Vehicle();
        alexCar.model = "Odyssey";
        alexCar.make = "Honda";


//        alexCar.beep();
//        myCar.beep();
//
        myCar.printMe();
        alexCar.printMe();

//        anna.printInfo();
//        david.printInfo();
//        xx.printInfo();

    }
}
