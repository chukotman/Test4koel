package lesson15;

public class Person {
    private String name;
    private static int count;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void hello(){
        System.out.println("Hello");
        System.out.println(name);
        System.out.println(count);
    }

    public static void hi(){
        System.out.println("Hi");
        System.out.println(count);
    }
}
