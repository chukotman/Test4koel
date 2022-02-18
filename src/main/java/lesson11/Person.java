package lesson11;

public class Person {
    private String name;
    private String lastName;
    private int year;
    private Address address;

    public Person(String name, String lastName, int year, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public Address getAddress() {
        return address;
    }
}
