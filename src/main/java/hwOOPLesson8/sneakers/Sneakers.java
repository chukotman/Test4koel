package hwOOPLesson8.sneakers;

public class Sneakers {
    public SneakersBrand brand;
    public SneakersColor color;
    public SneakersType type;
    public SneakersStockStatus stock;

    public void printSneakersInfo(){
        System.out.println("Brand: "+brand+"\nColor: "+color+"\nType: "+type+"\nStock status: "+stock+"\n");
    }
}
