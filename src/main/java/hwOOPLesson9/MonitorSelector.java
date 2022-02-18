package hwOOPLesson9;

public class MonitorSelector {
    private int screenSize;
    private String brand;
    private String resolution;
    private int refreshRate;


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public MonitorSelector(int screenSize, String brand, String resolution, int refreshRate){
        this.screenSize=screenSize;
        this.brand=brand;
        this.resolution=resolution;
        this.refreshRate=refreshRate;
    }
    public MonitorSelector(int screenSize, String brand){
        this.screenSize=screenSize;
        this.brand=brand;
    }
    public MonitorSelector(){}

    public void printInfo(){
        System.out.println("You selected: "+"\nScreen size: "+screenSize+"\nBrand: "
                +brand+"\nResolution: "+resolution+"\nRefresh Rate: "+refreshRate+"\n");
    }


}
