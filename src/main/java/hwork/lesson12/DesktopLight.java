package hwork.lesson12;

public class DesktopLight implements UsElectricalPlug{
    private int price;
    private String model;

    public DesktopLight(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void usPlugStandart() {
        System.out.println("I keep US plug standart");
    }
}
