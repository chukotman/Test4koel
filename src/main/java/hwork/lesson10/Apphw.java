package hwork.lesson10;

import hwork.lesson9a.hwork.Passanger;

public class Apphw {
    public static void main(String[] args) {
        Vihicle mazda = new Vihicle("Mazda", 1200, 2);
        Vihicle toyota = new Vihicle("Toyota", 1500, 2);

        Motorcycle honda = new Motorcycle("Honda", 500, 0,BikeType.SPPORT);
        Motorcycle suzuki = new Motorcycle("Suzuki", 250, 0, BikeType.SCOOTER);

        Truck volvo = new Truck("Volvo", 10000, 3, 4000);
        Truck freightliner = new Truck("Freightliner", 15000, 4, 10000);

        PassangerCar nissan = new PassangerCar("Nissan", 800, 2, 4);
        PassangerCar ford = new PassangerCar("Ford", 1600, 2, 5);

        mazda.printInfo();
        honda.printBikeInfo();
        freightliner.printTruckInfo();
        ford.printCarInfo();
    }
}
