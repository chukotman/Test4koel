package Tickets;

public class TicketPrice {
    private int age;
    private int basePrice;

    public TicketPrice(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }
    public double calculate(){
        if(age<=2){
            return 0;
        }
        if(age<=12){
            return this.basePrice*0.5;
        }
        if (age>65){
            return this.basePrice*0.8;
        }
        return basePrice;
    }
}
