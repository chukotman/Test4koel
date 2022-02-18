package hwork.lesson11;

public class Address {
    private String street1;
    private String city;
    private State state;
    private int zip;

    public Address(String street1, String city, State state, int zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet1() {
        return street1;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}
