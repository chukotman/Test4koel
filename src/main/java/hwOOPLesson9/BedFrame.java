package hwOOPLesson9;

public class BedFrame {
    private Size size;
    private String color;
    private Material material;

    protected enum Size {
        KING,
        QUEEN,
        FULL,
        DOUBLE
    }

    protected enum Material{
        METAL,
        WOOD
    }

    public BedFrame(Size size, String color, Material material){
        this.size=size;
        this.color=color;
        this.material=material;
    }

    public BedFrame(){}

    public void printInfo(){
        System.out.println("Your IKEA bed is: "+"\n"+"Size: "+size+"\nColor: "+color+"\nMaterial: "+material+"\n");
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
