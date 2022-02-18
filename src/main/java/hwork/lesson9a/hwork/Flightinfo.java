package hwork.lesson9a.hwork;

public class Flightinfo {
    private Flightnumber flightNumber;
    private String departureTime;
    private String arrivalTime;
    private String gateNumber;

    public Flightinfo(Flightnumber flightNumber, String departureTime, String arrivalTime, String gateNumber){
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gateNumber = gateNumber;
    }

    public Flightinfo(Flightnumber flightNumber, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Flightinfo(Flightnumber flightNumber, String gateNumber) {
        this.flightNumber = flightNumber;
        this.gateNumber = gateNumber;
    }

    public Flightinfo(Flightnumber flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flightinfo(){};

    public Flightnumber getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Flightnumber flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void printFlightInfo(){
        System.out.println("Flight Number [" + getFlightNumber() + "]\nDeparture [" + getDepartureTime() + "]\nArrival [" + getArrivalTime() + "]\nGate number [" + getGateNumber() + "]");
        System.out.println();
    }
}
