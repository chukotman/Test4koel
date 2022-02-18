package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name = n;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setYear(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Year should be bigger than 1900 an smaller than 2022, you passed: "+year);
        }
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}
