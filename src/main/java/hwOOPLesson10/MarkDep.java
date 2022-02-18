package hwOOPLesson10;

public class MarkDep extends Employees{
    protected TypeOfMark typeOfMark;

    public MarkDep(String name, String lastName, int employmentDate, Departments department, TypeOfWork type, TypeOfMark typeOfMark) {
        super(name, lastName, employmentDate, department, type);
        this.typeOfMark = typeOfMark;
    }
    public MarkDep(){}

    public String getMarkInfo() {
        return "MarkDep{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", department=" + department +
                ", type=" + type +
                ", typeOfMark=" + typeOfMark +
                '}';
    }

    public enum TypeOfMark {
        SocialMedia,
        Content,
        Digital
    }

}
