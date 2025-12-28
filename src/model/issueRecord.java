package model;

import java.time.LocalDate;

public class IssueRecord {

    private Book book;
    private Student student;
    private LocalDate issueDate;
    private LocalDate returnDate;

    // Constructor
    public IssueRecord(Book book, Student student, LocalDate issueDate) {
        this.book = book;
        this.student = student;
        this.issueDate = issueDate;
        this.returnDate = null;
    }

    // Getters
    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    // Set return date
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
