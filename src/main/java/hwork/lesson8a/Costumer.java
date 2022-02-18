package hwork.lesson8a;

public class Costumer {
    public int id;
    public String firstName;
    public String lastName;
    public int dateOfBirth;
    public long phoneNumber;

    public void printCostumer(){
        System.out.println(id + " " + firstName + " " + this.lastName + "\nDOB: "
        + dateOfBirth + "\nPhone#: " + phoneNumber);
        System.out.println();
    }
}
