package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:49 PM
 * @nameProject: Project_Architectural_Software
 */

public class BookFactory {
    public static Book createBook(String type, String title, String author) {
        switch (type.toLowerCase()) {
            case "paper": return new PaperBook(title, author);
            case "ebook": return new Ebook(title, author);
            default: throw new IllegalArgumentException("Unknown book type");
        }
    }
}