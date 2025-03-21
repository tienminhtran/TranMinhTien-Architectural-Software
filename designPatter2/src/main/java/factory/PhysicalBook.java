package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 9:05 PM
 * @nameProject: Project_Architectural_Software
 */

public class PhysicalBook extends Book {
    public PhysicalBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("📖 Physical Book: " + title + " by " + author);
    }
}