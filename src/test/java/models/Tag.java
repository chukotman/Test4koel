package models;

public class Tag {
    private String name;
    private long id;

    public Tag(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
