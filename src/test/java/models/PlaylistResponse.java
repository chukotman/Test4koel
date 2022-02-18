package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistResponse {
    private int id;
    private String name;

    public PlaylistResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PlaylistResponse() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
