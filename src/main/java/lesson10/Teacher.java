package lesson10;

public /*final*/ class Teacher extends Person{
    private String subject;

    public Teacher(String name, String lastName, int year, String subject) {
        super(name,lastName,year);
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public /*final*/ void printSubject(){
        System.out.println(subject);
    }
}
