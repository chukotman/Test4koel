package lesson9constructors;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName,int year){  //Person (String, String,int)
        this.name = name;
        this.lastName=lastName;
        this.year=year;
    }
    public Person(){} // Person()

    public Person(String name, String lastName){ // Person(String,String)
        this.name=name;
        this.lastName=lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
