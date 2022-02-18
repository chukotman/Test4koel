package hwOOPLesson8;

public class Property {
    public String type;
    public int bedrooms;
    public int bathrooms;
    public int price;
    public String listingStatus;

    public void printListingStatus(){
        System.out.println("Listing status is: "+listingStatus+"\n");
    }
    public void printListingInfo(){
        System.out.println("Type: "+type+"\nBedrooms: "+bedrooms+"\nBathrooms: "+bathrooms+"\nPrice: "+price);
    }
}
