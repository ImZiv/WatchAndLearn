package four.part5.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "source.txt";
        String copyFile = "copy.txt";
        //沒有使用try-with-resource的情況是這樣寫
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 資料輸入 fis
            fis = new FileInputStream(sourceFile);

            // 資料輸出 fos
            fos = new FileOutputStream(copyFile);

            byte[] buffer = new byte[1024]; // 緩衝區
            int length;

            // 邊讀邊寫
            while ((length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length);
            }

            System.out.println("檔案複製成功！");

        } catch (IOException e) {
            System.out.println("發生錯誤：" + e.getMessage());
        } finally {
            //關閉資源
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
