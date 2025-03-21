package factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:49 PM
 * @nameProject: Project_Architectural_Software
 */


public class BookFactory {
    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "physical":
                return new PhysicalBook(title, author, genre);
            case "ebook":
                return new EBook(title, author, genre);
            default:
                throw new IllegalArgumentException("Unknown book type: " + type);
        }
    }
}
