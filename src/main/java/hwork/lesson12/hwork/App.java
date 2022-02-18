package hwork.lesson12.hwork;

public class App {
    public static void main(String[] args) {
        Car prius = new Car(10, 4,1200);
        Car ford150 = new Car(20, 4, 2000);

        Car freightliner = new Truck(50, 10, 10000, 15000);
        Calculator volvo = new Truck(45, 12, 11000, 20000);
        Truck kamaz = new Truck(35.4, 10,  9800, 15000);

        prius.totalMass();
        ford150.totalMass();

        freightliner.totalMass();
        volvo.totalMass();
        kamaz.totalMass();
    }
}
