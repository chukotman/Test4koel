package hwOOPLesson10;

public final class DevDep extends Employees{
    protected TypeOfDev typeOfDev;
    protected ProgLanguage language;

    public DevDep(String name, String lastName, int employmentDate, Departments department, TypeOfWork type, TypeOfDev typeOfDev , ProgLanguage language) {
        super(name, lastName, employmentDate, department, type);
        this.typeOfDev = typeOfDev;
        this.language= language;
    }

    public DevDep(){}

    public String getDevInfo() {
        return "DevDep{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", department=" + department +
                ", type=" + type +
                ", typeOfDev=" + typeOfDev +
                ", language=" + language +
                '}';
    }

    public enum TypeOfDev {
        FrontEnd,
        BackEnd,
        FullStack
    }
    public enum ProgLanguage {
        Java,
        Python,
        Ruby,
        XML,
        CSS
    }
}
