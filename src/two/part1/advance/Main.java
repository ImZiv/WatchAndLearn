package two.part1.advance;

/**
 * 程式進入點
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // 建立書籍
        Book b1 = new PrintedBook("Java 基礎", "張三", 300);
        Book b2 = new EBook("設計模式", "李四", 5000);

        // 加入圖書館
        library.addBook(b1);
        library.addBook(b2);

        // 顯示所有書籍
        library.showBooks();
    }
}
