package hwOOPLesson10;

public class Employees {
    protected String name;
    protected String lastName;
    protected int employmentDate;
    protected Departments department;
    protected TypeOfWork type;

    public Employees(String name, String lastName, int employmentDate, Departments department, TypeOfWork type) {
        this.name = name;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.department = department;
        this.type = type;
    }

    public Employees() {
    }

    public Employees(String name, String lastName, int employmentDate, TypeOfWork type) {
        this.name = name;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.type = type;
    }

    public String getEmployeeInfo() {
        if (department==null){
            return "Employees{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", employmentDate=" + employmentDate +
                    ", type=" + type +
                    '}';
        }
        return "Employees{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", department=" + department +
                ", type=" + type +
                '}';
    }


    public enum Departments {
        QADep,
        DEVDep,
        MARKDep
    }
    public enum TypeOfWork {
        Remote,
        OnSite,
        Hybrid
    }

}
