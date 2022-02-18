package lesson10;

public class Person {
    protected String name;
    protected String lastName;
    protected int year;

    public Person() {
    }

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
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

    @Override
    public String toString() {
        return "Person ->" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '<';
    }
}
