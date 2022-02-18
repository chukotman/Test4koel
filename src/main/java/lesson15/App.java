package lesson15;

public class App {
    private static final int HELLO = 7;
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        System.out.println(anna.getCount());

        Person david = new Person("David");
        System.out.println(david.getCount());
        System.out.println(anna.getCount());

        Person jane = new Person("Jane");
        System.out.println(anna.getCount());

        jane.hello();
        Person.hi();
        hi();

    }
    public static void hi(){
        System.out.println("Hi");
    }
}
