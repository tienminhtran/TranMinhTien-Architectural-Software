package decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:56 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;

// Decorator Pattern
public abstract class BookDecorator extends Book {
    protected Book decoratedBook;

    public BookDecorator(Book book) {
        super(book.title, book.author);
        this.decoratedBook = book;
    }

    public abstract void displayInfo();
}