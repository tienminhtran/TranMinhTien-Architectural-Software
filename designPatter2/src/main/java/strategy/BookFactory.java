package strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:50 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;
import java.util.List;

// Strategy Pattern
public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
