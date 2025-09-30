package five.part2.advance;

import java.io.File;
import java.io.IOException;

/**
 * 簡易檔案管理器
 */
public class Main {
    public static void main(String[] args) {
        // 建立「practice」資料夾
        File folder = new File("practice");
        if (!folder.exists()) {
            boolean created = folder.mkdir();
            System.out.println(created ? "資料夾建立成功！" : "資料夾建立失敗！");
        } else {
            System.out.println("資料夾已存在。");
        }

        //  在資料夾中建立不同名稱的 txt 檔案
        File file1 = new File(folder, "file1.txt");
        File file2 = new File(folder, "file2.txt");
        File file3 = new File(folder, "file3.txt");

        try {
            if (file1.createNewFile()) System.out.println("建立檔案: " + file1.getName());
            if (file2.createNewFile()) System.out.println("建立檔案: " + file2.getName());
            if (file3.createNewFile()) System.out.println("建立檔案: " + file3.getName());
        } catch (IOException e) {
            System.out.println("建立檔案時發生錯誤: " + e.getMessage());
        }

        // 將檔案重新命名
        File renamedFile = new File(folder, "renamed.txt");
        if (file1.exists() && file1.renameTo(renamedFile)) {
            System.out.println("檔案重新命名成功: " + renamedFile.getName());
        }

        // 刪除檔案
        if (file2.exists() && file2.delete()) {
            System.out.println("刪除檔案成功: " + file2.getName());
        }

        // 列出資料夾內容
        System.out.println("\n=== 最終資料夾內容 ===");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(" - " + f.getName());
            }
        }
    }
}
