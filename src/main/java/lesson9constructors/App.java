package lesson9constructors;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Wilson",1995);
        Person david = new Person();
        david.setLastName("Jonson");
        david.setName("David");
        david.setYear(1998);

        Person jane = new Person("Jane","Dole");
        jane.setYear(1992);



        Vehicle myCar = new Vehicle(2011,"Toyota","Camry","Silver");

    }
}
