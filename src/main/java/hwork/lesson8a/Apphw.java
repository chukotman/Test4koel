package hwork.lesson8a;

public class Apphw {
    public static void main(String[] args){

        /*Costumer purchases a Product and gets an issue
        There is 4 classes creaated:
        Costumer
        Address
        Product
        Issue
         */

        //Costumer Daniel Richards
        Costumer daniel = new Costumer();
        daniel.id = 1;
        daniel.firstName = "Daniel";
        daniel.lastName = "Richards";
        daniel.dateOfBirth = 12011986;
        daniel.phoneNumber = 7189875634L;

        Address danAddress = new Address();
        danAddress.buildingNumber = 1857;
        danAddress.streetName = "Ocaen Ave";
        danAddress.apt = "1K";
        danAddress.city = City.BROOKLYN;
        danAddress.state = State.NY;
        danAddress.zipCode = 11230;

        Product danProduct = new Product();
        danProduct.productName = "MacBook Pro";
        danProduct.price = 899.99;
        danProduct.weight = 2045.5;

        Issue danIssue = new Issue();
        danIssue.dateOfissue = 9052021;
        danIssue.description = "Glass Cracked";
        danIssue.issueStatus = IssueStatus.DETERMINED;


        //Information about daniel gets out by the functions
        daniel.printCostumer();
        danAddress.printAddress();
        danProduct.printProduct();
        danIssue.printIssue();

        //Costumer Helen McDonald
        Costumer helen = new Costumer();
        helen.id = 2;
        helen.firstName = "Helen";
        helen.lastName = "MacDonald";
        helen.dateOfBirth = 8051988;
        helen.phoneNumber = 9295670756L;

        Address helAddress = new Address();
        helAddress.buildingNumber = 2025;
        helAddress.streetName = "MacDonald Ave";
        helAddress.apt = "307";
        helAddress.city = City.PHILADELPHIA;
        helAddress.state = State.PA;
        helAddress.zipCode = 11145;

        Product helProduct = new Product();
        helProduct.productName = "Samsung One+";
        helProduct.price = 455.3;
        helProduct.weight = 230.6;

        Issue helIssue = new Issue();
        helIssue.dateOfissue = 10032020;
        helIssue.description = "Not Downloading";
        helIssue.issueStatus = IssueStatus.UNKHOWN;

        //Information about Helen gets out by the functions
        helen.printCostumer();
        helAddress.printAddress();
        helProduct.printProduct();
        helIssue.printIssue();

    }
}
