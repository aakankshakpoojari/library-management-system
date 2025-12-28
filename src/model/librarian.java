package model;

public class Librarian extends User {

    // Constructor
    public Librarian(int userId, String name) {
        super(userId, name);
    }

    // Polymorphism
    @Override
    public String getUserType() {
        return "Librarian";
    }
}
