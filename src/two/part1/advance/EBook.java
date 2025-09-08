package two.part1.advance;

/**
 * 電子書，繼承 Book
 */
public class EBook extends Book {
    private int fileSize;  // 檔案大小（KB）

    public EBook(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("[電子書] " + getTitle() + " - " + getAuthor() + "，大小：" + fileSize + "KB");
    }
}
