package model;

public class Student extends User {

    private int maxBooksAllowed;

    // Constructor
    public Student(int userId, String name) {
        super(userId, name);
        this.maxBooksAllowed = 3; // default limit
    }

    // Getter
    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }

    // Setter
    public void setMaxBooksAllowed(int maxBooksAllowed) {
        this.maxBooksAllowed = maxBooksAllowed;
    }

    // Polymorphism
    @Override
    public String getUserType() {
        return "Student";
    }
}
