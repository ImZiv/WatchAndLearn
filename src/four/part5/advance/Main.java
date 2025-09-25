package four.part5.advance;

import java.io.*;

/**
 * 實作檔案大小計算器
 */
public class Main {
    public static void main(String[] args) {
        // 要自己建立測試用檔案，記得指定到你自己的package下面
        String filePath = "bigfile.txt";
        calculateFileSize(filePath);
    }

    // 計算檔案大小的方法
    public static void calculateFileSize(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("檔案不存在：" + filePath);
            return;
        }
        // 檔案總大小 (位元組)
        long totalBytes = file.length();
        // 已讀取的位元組
        long readBytes = 0;

        // 使用 try-with-resources，自動關閉檔案
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            byte[] buffer = new byte[1024]; // 一次讀取 1KB
            int length;

            while ((length = bis.read(buffer)) != -1) {
                readBytes += length;
                // 顯示進度百分比
                int progress = (int) ((readBytes * 100) / totalBytes);
                System.out.print("讀取進度：" + progress + "%");
            }
            System.out.println("檔案大小：" + totalBytes + " 位元組");

        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
