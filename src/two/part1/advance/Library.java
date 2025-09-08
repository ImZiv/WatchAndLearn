package two.part1.advance;

import java.util.ArrayList;
import java.util.List;

/**
 * 圖書館：管理書籍
 */
public class Library {
    // 這是使用list套件，之後會提到
    private List<Book> books = new ArrayList<>();

    // 加入書籍
    public void addBook(Book book) {
        books.add(book);
    }

    // 顯示所有書籍
    public void showBooks() {
        System.out.println("=== 圖書館藏書 ===");
        for (Book b : books) {
            b.displayInfo();  // 多型：呼叫不同子類別的顯示方法
        }
    }
}