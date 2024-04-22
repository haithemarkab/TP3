package org.example;

public class User {
    private long id;
    private String username;
    private String email;

    // Constructeur, getters et setters
    public User(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}