package five.part2.basic;

import java.io.File;
import java.util.Date;

/**
 * 熟悉File類別的基本操作方法
 */
public class Main {
    public static void main(String[] args) {
        File desktop = new File("src\\five\\part2\\basic");
        if (!desktop.exists() || !desktop.isDirectory()) {
            System.out.println("資料夾不存在，請確認路徑是否正確！");
        }

        // 列出桌面所有檔案
        File[] files = desktop.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("資料夾是空的。");
        }

        int fileCount = 0;
        int dirCount = 0;

        System.out.println("=== 桌面檔案資訊 ===");
        for (File f : files) {
            if (f.isFile()) {
                fileCount++;
                System.out.println("[檔案] " + f.getName() +
                        " | 大小: " + f.length() + " 位元組" +
                        " | 最後修改時間: " + new Date(f.lastModified()));
            } else if (f.isDirectory()) {
                dirCount++;
                System.out.println("[資料夾] " + f.getName());
            }
        }

        // 統計結果
        System.out.println("=== 統計結果 ===");
        System.out.println("檔案數量: " + fileCount);
        System.out.println("資料夾數量: " + dirCount);
    }
}
