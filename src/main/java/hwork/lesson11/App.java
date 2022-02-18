package hwork.lesson11;

public class App {
    public static void main(String[] args) {
        Address annaAddress = new Address("12 Elm Str", "Gotham City", State.IL, 55555);
        Person anna = new Person("Anna", "Willson", 1995, annaAddress);

//        String street  = anna.getAddress().getCity();
//        System.out.println(street);

        Address a = anna.getAddress();
        String street = a.getStreet1();

        Address davidAddress = new Address("45 Sun Ave", "Solar city", State.CA, 99787);
        Person david = new Person("David", "Peterson", 1997, davidAddress);

        Team redSocks = new Team(anna, david);

        String city = redSocks.getMember().getAddress().getCity();
        System.out.println(city);



    }
}
