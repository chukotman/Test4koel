package models;

public class CredentialsRequest {
    private String email;
    private String password;

    public CredentialsRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public CredentialsRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
