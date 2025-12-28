package service;

import model.Book;
import model.Student;
import model.IssueRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class LibraryService {

    private HashMap<Integer, Book> books;
    private ArrayList<Student> students;
    private ArrayList<IssueRecord> issueRecords;

    public LibraryService() {
        books = new HashMap<>();
        students = new ArrayList<>();
        issueRecords = new ArrayList<>();
    }

    // -------- Book operations --------

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void viewAllBooks() {
        for (Book book : books.values()) {
            book.displayBook();
        }
    }

    public Book getBookById(int bookId) {
        return books.get(bookId);
    }

    // -------- Student operations --------

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int studentId) {
        for (Student s : students) {
            if (s.getUserId() == studentId) {
                return s;
            }
        }
        return null;
    }

    // -------- Issue / Return --------

    public boolean issueBook(int bookId, int studentId) {
        Book book = books.get(bookId);
        Student student = getStudentById(studentId);

        if (book == null || student == null) {
            return false;
        }

        if (!book.isAvailable()) {
            return false;
        }

        book.setAvailable(false);
        IssueRecord record =
                new IssueRecord(book, student, LocalDate.now());
        issueRecords.add(record);

        return true;
    }

    public boolean returnBook(int bookId) {
        for (IssueRecord record : issueRecords) {
            if (record.getBook().getBookId() == bookId &&
                record.getReturnDate() == null) {

                record.setReturnDate(LocalDate.now());
                record.getBook().setAvailable(true);
                return true;
            }
        }
        return false;
    }

    // -------- View records --------

    public void viewIssueRecords() {
        for (IssueRecord record : issueRecords) {
            System.out.println(
                "Book: " + record.getBook().getTitle() +
                ", Student: " + record.getStudent().getName() +
                ", Issued: " + record.getIssueDate() +
                ", Returned: " + record.getReturnDate()
            );
        }
    }
}
