package hwOOPLesson8.cats;

public class Cats {
    public String name;
    public int age;
    public String breed;
    public String preferredFood;
    public String character;
    public CatsColor color;

    public void psps() {
        System.out.println(name + " is miu miu"+"\n");
    }

    public void printCatInfo() {
        System.out.println("name: " + name + "\nAge: " + age + "\nBreed: " + breed + "\nPreferred food: " + preferredFood +
                "\nCharacter: " + character + "\nColor: " + color);
    }
}
