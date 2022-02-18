package lesson11;

public class App {
    public static void main(String[] args) {
        Address annaAddress = new Address("12 Elm str","Gotham city",State.IL,55555);
        Person anna = new Person("Anna","Wilson",1995,annaAddress);


        String street = anna.getAddress().getStreet1();
        System.out.println(street);

//        Address a = anna.getAddress();
//        String street = a.getStreet1();

        Address davidAddress = new Address("45 Sun ave","Solar city", State.CA,99878);
        Person david = new Person("David","Peterson",1997,davidAddress);

        Team redSocks = new Team(anna,david);


        String city = redSocks.getMember().getAddress().getCity();
        System.out.println(city);

    }
}
