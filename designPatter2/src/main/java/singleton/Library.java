package singleton;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:47 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books = new ArrayList<>();

    private Library() {}

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
