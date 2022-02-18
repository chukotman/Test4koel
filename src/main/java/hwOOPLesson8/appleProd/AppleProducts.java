package hwOOPLesson8.appleProd;

public class AppleProducts {
    public String deviceType;
    public AppleMacBook macbook;
    public AppleAirPod airpods;
    public AppleProdColors color;
    public AppleProdRAM ram;

    public void appleInfo(){
        String x = "MacBook";
        if (deviceType==x){
            System.out.println("Device type: "+deviceType+"\nModel: "+macbook+
                    "\nColor: "+color+"\nRAM Size: "+ram+"\n");
        }
        else {
            System.out.println("Device type: "+deviceType+"\nModel: "+airpods+
                    "\nColor: "+color+"\n");
        }


    }
}

