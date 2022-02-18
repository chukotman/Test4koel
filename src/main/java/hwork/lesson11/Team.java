package hwork.lesson11;

public class Team {
    private Person lead;
    private Person member;

    public Team(Person lead, Person member) {
        this.lead = lead;
        this.member = member;
    }

    public Person getLead() {
        return lead;
    }

    public Person getMember() {
        return member;
    }
}
