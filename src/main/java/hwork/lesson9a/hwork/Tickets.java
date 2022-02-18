package hwork.lesson9a.hwork;

public class Tickets {
    private String destination;
    private double price;
    private int quantity;
    private float discount;

    public Tickets(String destination, double price, int quantity, float discount){
        this.destination = destination;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Tickets(String destination, double price, int quantity){
        this.destination = destination;
        this.price = price;
        this.quantity = quantity;
    }

    public Tickets(String destination, double price){
        this.destination = destination;
        this.price = price;
    }

    public Tickets(String destination){
        this.destination = destination;
    }

    public Tickets(){};

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void prinTickets(){
        System.out.println("Destination: " + getDestination() + " -  $" + getPrice() + " - " + getDiscount() + "% (Discount)\nQuantity: " + getQuantity());
    }
}
