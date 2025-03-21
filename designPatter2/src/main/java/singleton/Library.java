package singleton;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:47 PM
 * @nameProject: Project_Architectural_Software
 */

public class Library {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
