package hwOOPLesson9;

public class TruckSelector {
    private String truckType;
    private String trailerType;
    private String model;
    private int limitWeight;

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLimitWeight() {
        return limitWeight;
    }

    public void setLimitWeight(int limitWeight) {
        this.limitWeight = limitWeight;
    }

    public TruckSelector(String model, String truckType, String trailerType, int limitWeight){
        this.model=model;
        this.truckType=truckType;
        this.trailerType=trailerType;
        this.limitWeight=limitWeight;
    }
    public TruckSelector(){}

    public void printTruckInfo(){
        System.out.println("Your last truck was:"+"\n"+"Model: "+model+"\nTruck Type: "+truckType+
                "\nTrailer Type: "+trailerType+"\nLimit Weight: "+limitWeight+"\n");
    }

}
