package hwork.lesson14.hwork;

public class Company {
    private String name;
    private int employeeNumber;

    public Company(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getCompanyInfo(){
        return name + " - " + employeeNumber;
    }
}
