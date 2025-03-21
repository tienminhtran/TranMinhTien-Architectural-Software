package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:48 PM
 * @nameProject: Project_Architectural_Software
 */

public abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();
}
