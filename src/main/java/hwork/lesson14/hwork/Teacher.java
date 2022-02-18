package hwork.lesson14.hwork;

public class Teacher {
    private String subject;
    private String name;
    private int numberOfhours;

    public Teacher(String name, String subject, int numberOfhours) {
        this.subject = subject;
        this.name = name;
        this.numberOfhours = numberOfhours;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfhours() {
        return numberOfhours;
    }

    public String getTeacherInfo(){
        return name + ": " + subject + " - " + numberOfhours;
    }
}
