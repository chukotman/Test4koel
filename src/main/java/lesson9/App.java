package lesson9;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.setName("Anna");
        anna.setLastName("Wilson");
        anna.setYear(2021);

        System.out.println(anna.getLastName());

        int annaYearOfBirth =anna.getYear();
        System.out.println(annaYearOfBirth);

    }
}
