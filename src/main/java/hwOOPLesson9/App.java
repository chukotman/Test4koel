package hwOOPLesson9;

public class App {
    public static void main(String[]args){

        // for MonitorSelector
        MonitorSelector samsungWMX27x = new MonitorSelector();
        samsungWMX27x.setScreenSize(27);
        samsungWMX27x.setBrand("Samsung");
        samsungWMX27x.setResolution("4K");
        samsungWMX27x.setRefreshRate(120);

        MonitorSelector lgJSX32pp = new MonitorSelector(32, "LG","2K",65);

        samsungWMX27x.printInfo();
        lgJSX32pp.printInfo();

        // for BedFrame
        BedFrame ikeaKing = new BedFrame();
        ikeaKing.setSize(BedFrame.Size.KING);
        ikeaKing.setColor("White");
        ikeaKing.setMaterial(BedFrame.Material.WOOD);
        ikeaKing.printInfo();

        BedFrame ikeaQueen = new BedFrame(BedFrame.Size.QUEEN, "White", BedFrame.Material.METAL);
        ikeaQueen.printInfo();

        // for Games
        Games stronghold = new Games();
        stronghold.setName("Stronghold");
        stronghold.setType(Games.GType.Strategy);
        stronghold.setGos(Games.GOS.Windows);
        stronghold.setAge(Games.Age.Old);
        stronghold.printYourGame();

        Games battlefield = new Games("Battlefield", Games.GType.Action, Games.GOS.MacOS, Games.Age.New);
        battlefield.printYourGame();

        // for TruckSelector
        TruckSelector volvo = new TruckSelector();
        volvo.setModel("VOLVO VNL 760");
        volvo.setTruckType("Long Haul With Sleeper");
        volvo.setTrailerType("Dry Van");
        volvo.setLimitWeight(80000);
        volvo.printTruckInfo();

        TruckSelector freightliner = new TruckSelector("FreightLiner Cascadia Evolution", "Long Haul With Sleeper",
                "Reefer", 80000);
        freightliner.printTruckInfo();
    }
}
