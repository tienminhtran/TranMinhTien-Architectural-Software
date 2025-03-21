package decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:56 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;

public abstract class BookDecorator implements Borrowable {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    public abstract void borrow();
}