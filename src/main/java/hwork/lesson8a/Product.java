package hwork.lesson8a;

public class Product {
    public String productName;
    public double weight;
    public double price;

    public void printProduct(){
        System.out.println(productName + " - " + price + " - " + weight);
        System.out.println();
    }
}
