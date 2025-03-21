package main;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:58 PM
 * @nameProject: Project_Architectural_Software
 */


import singleton.Library;
import factory.Book;
import factory.BookFactory;
import strategy.SearchByTitle;
import observer.LibraryNotifier;
import observer.User;
import decorator.ExtendedLoanBook;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book book1 = BookFactory.createBook("paper", "Harry Potter", "J.K. Rowling");
        Book book2 = BookFactory.createBook("ebook", "The Hobbit", "J.R.R. Tolkien");
        library.addBook(book1);
        library.addBook(book2);

        LibraryNotifier notifier = new LibraryNotifier();
        User user1 = new User("Alice");
        notifier.addObserver(user1);
        notifier.notifyObservers("New book available: Harry Potter");

        SearchByTitle search = new SearchByTitle();
        System.out.println("Search results:");
        search.search(library.getBooks(), "Harry").forEach(Book::displayInfo);

        Book extendedLoanBook = new ExtendedLoanBook(book1);
        extendedLoanBook.displayInfo();
    }
}
