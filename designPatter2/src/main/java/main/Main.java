package main;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:58 PM
 * @nameProject: Project_Architectural_Software
 */



import factory.*;
import observerOk.LibraryNotifier;
import observerOk.User;
import singleton.*;
import strategy.*;
import decorator.*;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Factory Pattern - Thêm sách vào thư viện
        Book book1 = BookFactory.createBook("physical", "Harry Potter", "J.K. Rowling", "Fantasy");
        Book book2 = BookFactory.createBook("ebook", "Effective Java", "Joshua Bloch", "Programming");
        library.addBook(book1);
        library.addBook(book2);

        // Strategy Pattern - Tìm kiếm sách theo tên
        SearchStrategy searchStrategy = new SearchByTitle();
        System.out.println("Tìm kiếm sách: ");
        searchStrategy.search(library.getBooks(), "Harry Potter").forEach(Book::display);

        // Observer Pattern - Thêm người nhận thông báo
        LibraryNotifier notifier = new LibraryNotifier();
        User user1 = new User("Minh");
        notifier.addObserver(user1);
        notifier.notifyObservers("Sách mới đã được thêm vào thư viện!");

        // Decorator Pattern - Mượn sách với tính năng mở rộng
        Borrowable specialBook = new ExtendedLoanBook(book1);
        specialBook.borrow();
    }
}
