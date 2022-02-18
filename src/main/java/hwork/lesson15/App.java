package hwork.lesson15;

import jdk.jshell.PersistentSnippet;

public class App {
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
    }
}
