package model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String title, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Display book info
    public void displayBook() {
        System.out.println(
            "ID: " + bookId +
            "\n Title: " + title +
            "\n Author: " + author +
            "\n Available: " + isAvailable +
            "\n Category: " + category 
        );
    }
}
