package hwork.lesson9a.hwork;

public class Apphw {
    public static void main(String[] args) {

        //first passenger's info is filled by full costructors only
        Passanger daniel = new Passanger("Daniel", "Liberty", Flightnumber.TU134, BoardingStatus.UNBOARDED);
        Flightinfo danFlight = new Flightinfo(Flightnumber.TU134, "3.05 pm", "4.53 pm", "23K");
        Airplane danAirplane = new Airplane("Boing 747-400", 300, 8);
        Tickets danTickets = new Tickets("Moscow", 900.56, 289, 15);

        //INFO printed
        daniel.printClass();
        danFlight.printFlightInfo();
        danAirplane.printAirplane();
        danTickets.prinTickets();

        Passanger sam = new Passanger("Samuel", "Wilson");
        sam.setBoardingStatus(BoardingStatus.BOARDED);
        sam.setFlightNumber(Flightnumber.IU202);

        //field being filled out by setters only
        Flightinfo samFlight = new Flightinfo();
        samFlight.setFlightNumber(Flightnumber.IU202);
        samFlight.setGateNumber("34R");
        samFlight.setDepartureTime("1:15 am");
        samFlight.setArrivalTime("10:47 pm");

        Airplane samAirplane = new Airplane("Airbus A320", 250, 4);
        Tickets samTickets = new Tickets("San Francisco", 675.45, 150, 10);

        sam.printClass();
        samFlight.printFlightInfo();
        samAirplane.printAirplane();
        samTickets.prinTickets();

    }
}
