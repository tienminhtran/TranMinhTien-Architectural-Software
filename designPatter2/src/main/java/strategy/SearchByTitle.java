package strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:54 PM
 * @nameProject: Project_Architectural_Software
 */

import factory.Book;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByTitle implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(book -> book.title.contains(keyword))
                .collect(Collectors.toList());
    }
}