package hwork.lesson9a.hwork;

public class Passanger {
    private String name;
    private String lastName;
    private Flightnumber flightNumber;
    private BoardingStatus boardingStatus;

    //full constructor
    public Passanger(String name, String lastName, Flightnumber flightNumber, BoardingStatus boardingStatus){
        this.name = name;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.boardingStatus = boardingStatus;
    }

    //Partial constructor
    public Passanger(String name, String lastName, Flightnumber flightNumber){
        this.name = name;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
    }

    public Passanger(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //Default constructor
    public Passanger(){};

    //Getters and Setters for Partial and default constructor
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
    public Flightnumber getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(Flightnumber flightNumber) {
        this.flightNumber = flightNumber;
    }
    public BoardingStatus getBoardingStatus() {
        return boardingStatus;
    }
    public void setBoardingStatus(BoardingStatus boardingStatus) {
        this.boardingStatus = boardingStatus;
    }

    //printClass function
    public void printClass(){
            System.out.println(getName() + " " + getLastName() + "\n" + getFlightNumber() + " - " + getBoardingStatus());
            System.out.println();
    }

}
