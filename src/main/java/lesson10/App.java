package lesson10;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Wilson",1995);
//        System.out.println(anna);
        Student david = new Student("David","Peterson",1999,"Economics");
        Teacher mrJones = new Teacher("Alex","Jones",1985,"Math");

        mrJones.setName("Alexander");

    }
}
