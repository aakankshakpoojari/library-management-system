package main;

import model.Book;
import model.Student;
import service.LibraryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add Student");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Issue Records");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    libraryService.addBook(
                        new Book(bookId, title, author, category)
                    );
                    System.out.println("Book added");
                    break;

                case 2:
                    libraryService.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    libraryService.addStudent(
                        new Student(studentId, name)
                    );
                    System.out.println("Student added");
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Student ID: ");
                    int issueStudentId = sc.nextInt();

                    if (libraryService.issueBook(issueBookId, issueStudentId)) {
                        System.out.println("Book issued");
                    } else {
                        System.out.println("Issue failed");
                    }
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    int returnBookId = sc.nextInt();

                    if (libraryService.returnBook(returnBookId)) {
                        System.out.println("Book returned");
                    } else {
                        System.out.println("Return failed");
                    }
                    break;

                case 6:
                    libraryService.viewIssueRecords();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
