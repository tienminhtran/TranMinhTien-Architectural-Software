package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:49 PM
 * @nameProject: Project_Architectural_Software
 */

public class PaperBook extends Book {
    public PaperBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Paper Book: " + title + " by " + author);
    }
}
