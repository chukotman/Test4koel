package hwork.lesson9a;

public class Persons {
    private String name;
    private String lastName;
    private int year;

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYear(int year) {
        if (year > 2021 || year < 1900){
            throw new IllegalArgumentException("Year should be either later than 1900 or less than 2022: " + year);
        }
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }
    public void printPerson(){
        System.out.println(getYear() + "\n" + getName() + " " + getLastName());
    }

}
