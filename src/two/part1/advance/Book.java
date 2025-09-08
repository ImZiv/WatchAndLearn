package two.part1.advance;

/**
 * 父類別 -書籍
 */
public abstract class Book {
    private String title;   // 書名
    private String author;  // 作者

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter 封裝
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // 抽象方法：顯示書籍資訊
    public abstract void displayInfo();
}
