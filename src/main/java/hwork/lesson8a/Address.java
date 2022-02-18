package hwork.lesson8a;

public class Address {
    public int buildingNumber;
    public String streetName;
    public String apt;
    public City city; //City enum
    public State state; //State enum
    public int zipCode;

    public void printAddress(){
        System.out.println(buildingNumber + " " + streetName + " APT " + apt +
                "\n" + city + ", " + state + "   " + zipCode);
        System.out.println();
    }
}
