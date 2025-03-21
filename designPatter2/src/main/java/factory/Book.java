package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:48 PM
 * @nameProject: Project_Architectural_Software
 */


public abstract class Book {
    public String title;
    protected String author;
    protected String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public abstract void display();
}