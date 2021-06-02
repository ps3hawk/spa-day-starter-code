package org.launchcode.spaday.models;

public class User {
    private int id;
    private static int nextId = 1;

    private String userName;
    private String email;
    private String password;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String userName, String email, String password) {
        this();
        this.userName = userName;
        this.email = email;
        this.password = password;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
