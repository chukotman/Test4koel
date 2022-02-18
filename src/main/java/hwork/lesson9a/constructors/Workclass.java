package hwork.lesson9a.constructors;

public class Workclass {
    public static void main(String[] args) {
        Person anna  = new Person("Anna", "Willson", 1986);

        Person david = new Person();
        david.setName("David");
        david.setLastName("Johnson");
        david.setYear(1998);

        Person jane = new Person("Jane", "Dole");
        jane.setYear(1992);

        Vihicle myCar = new Vihicle(2015, "Toyota", "Prius", "Grey");

        System.out.println(myCar.getYear() + " " + myCar.getMake() + " " + myCar.getModel() + " " + myCar.getColor());
    }
}
