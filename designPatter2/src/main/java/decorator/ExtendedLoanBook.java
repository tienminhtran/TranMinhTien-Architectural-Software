package decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:56 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;
import factory.Book;

public class ExtendedLoanBook extends BookDecorator {
    public ExtendedLoanBook(Book book) {
        super(book);
    }

    @Override
    public void borrow() {
        System.out.println("Mượn sách với thời gian gia hạn: " + book.title);
    }
}