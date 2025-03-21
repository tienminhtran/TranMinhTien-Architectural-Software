package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:49 PM
 * @nameProject: Project_Architectural_Software
 */
import factory.Book;

public class EBook extends Book {
    public EBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("📱 E-Book: " + title + " by " + author);
    }
}