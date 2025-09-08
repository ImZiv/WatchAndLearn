package two.part1.advance;

/**
 * 紙本書，繼承 Book
 */
public class PrintedBook extends Book {
    private int pages;  // 頁數

    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("[紙本書] " + getTitle() + " - " + getAuthor() + "，頁數：" + pages);
    }
}
