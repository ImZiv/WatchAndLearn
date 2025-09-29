package four.part6.basic;

import java.io.*;
import java.util.Scanner;

/**
 * 製作簡單的記事本程式
 */
public class Main {
    public static void main(String[] args) {
        // 你自己建立好的檔案，記得路徑要改
        String fileName = "note.txt";

        try {
            // 使用 BufferedReader 讀取並顯示
            System.out.println("=== 目前檔案內容 ===");
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // 使用 Scanner 輸入新內容
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入要新增的內容：");
            String newContent = scanner.nextLine();

            // 使用 BufferedWriter (FileWriter with append=true) 附加到檔案尾端
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
                bw.write(newContent);
                bw.newLine();
            }
            System.out.println("新增完成");
        } catch (IOException e) {
            System.out.println("檔案操作發生錯誤：" + e.getMessage());
        }
    }
}
