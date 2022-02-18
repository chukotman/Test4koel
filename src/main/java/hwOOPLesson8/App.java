package hwOOPLesson8;

import hwOOPLesson8.appleProd.*;
import hwOOPLesson8.cats.Cats;
import hwOOPLesson8.cats.CatsColor;
import hwOOPLesson8.sneakers.*;

public class App {
    public static void main(String[] args){
        // for Class Property
        Property whiteHouse = new Property();
        whiteHouse.type = "Single family home";
        whiteHouse.bathrooms = 3;
        whiteHouse.bedrooms = 2;
        whiteHouse.price = 450000;
        whiteHouse.listingStatus = "Sold";
        whiteHouse.printListingInfo();
        whiteHouse.printListingStatus();

        Property dreamHouse = new Property();
        dreamHouse.type = "Single family home";
        dreamHouse.bedrooms = 5;
        dreamHouse.bathrooms = 3;
        dreamHouse.price = 350000;
        dreamHouse.listingStatus = "Available for purchase";
        dreamHouse.printListingInfo();
        dreamHouse.printListingStatus();

        // for Class Cats
        Cats cookie = new Cats();
        cookie.name = "Cookie";
        cookie.age = 2;
        cookie.breed = "American short hair";
        cookie.preferredFood = "Dry food";
        cookie.character = "Good with people and other cats";
        cookie.color = CatsColor.WHITE;
        cookie.printCatInfo();
        cookie.psps();

        Cats muffin = new Cats();
        muffin.name = "Muffin";
        muffin.age = 2;
        muffin.breed = "American short hair";
        muffin.preferredFood = "Wet food";
        muffin.character = "Good with other cats";
        muffin.color = CatsColor.GINGER;
        muffin.printCatInfo();
        muffin.psps();

        // for Class Sneakers
        Sneakers newBalance993 = new Sneakers();
        newBalance993.brand = SneakersBrand.NEWBALANCE;
        newBalance993.color = SneakersColor.WHITE;
        newBalance993.type = SneakersType.LIFESTYLE;
        newBalance993.stock = SneakersStockStatus.INSTOCK;
        newBalance993.printSneakersInfo();

        Sneakers nikePegasusTrail = new Sneakers();
        nikePegasusTrail.brand = SneakersBrand.NIKE;
        nikePegasusTrail.color = SneakersColor.RED;
        nikePegasusTrail.type = SneakersType.TRAIL;
        nikePegasusTrail.stock = SneakersStockStatus.OUTOFSTOCK;
        nikePegasusTrail.printSneakersInfo();

        // for Class AppleProducts
        AppleProducts macbook = new AppleProducts();
        macbook.deviceType = "MacBook";
        macbook.macbook = AppleMacBook.MACBOOK_AIR;
        macbook.color = AppleProdColors.SPACE_GRAY;
        macbook.ram = AppleProdRAM.TB_1;
        macbook.appleInfo();

        AppleProducts airpods = new AppleProducts();
        airpods.deviceType = "AirPods";
        airpods.airpods = AppleAirPod.AIRPODS_3TH_GEN;
        airpods.color = AppleProdColors.WHITE;
        airpods.appleInfo();















    }
}
