package model;

public abstract class User {

    protected int userId;
    protected String name;

    // Constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (polymorphism)
    public abstract String getUserType();
}
