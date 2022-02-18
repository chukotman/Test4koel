package hwOOPLesson10;

public final class QADep extends Employees {
    private TypeOfQA typeOfQA;

    public QADep(String name, String lastName, int employmentDate, Departments department,
                 TypeOfWork type, TypeOfQA typeOfQA) {
        super(name, lastName, employmentDate, department, type);
        this.typeOfQA = typeOfQA;
    }

    public String getQAInfo() {
        return "QADep{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", department=" + department +
                ", type=" + type +
                ", typeOfQA=" + typeOfQA +
                '}';
    }

    public enum TypeOfQA {
        Manual,
        Automation
    }
}
