package hwOOPLesson9;

public class Games {
    private String name;
    private GType type;
    private GOS gos;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GType getType() {
        return type;
    }

    public void setType(GType type) {
        this.type = type;
    }

    public GOS getGos() {
        return gos;
    }

    public void setGos(GOS gos) {
        this.gos = gos;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Games(String name, GType type, GOS gos, Age age){
        this.name=name;
        this.type=type;
        this.gos=gos;
        this.age=age;
    }
    public Games(){}

    protected enum GType {
        Strategy,
        Action,
        RPG
    }

    protected enum GOS {
        Windows,
        Linux,
        MacOS
    }

    protected enum Age {
        Old,
        New
    }

    public void printYourGame(){
        System.out.println("Your choice is: "+"\n"+"Game name: "+name+"\nGame type: "
                +type+"\nGame OS: "+gos+"\nNew game? "+age+"\n");
    }
    }

