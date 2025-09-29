package four.part6.advance;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * 學生成績管理系統
 */
public class Main {
    public static void main(String[] args) {
        try {

            // 序列化檔案
            String objFile = "students.dat";
            // 匯出的 CSV(一種用逗號分隔的檔案格式)
            String csvFile = "students.csv";

            // 建立學生清單
            List<Student> students = Arrays.asList(
                    new Student("小明", 85),
                    new Student("小華", 90),
                    new Student("小美", 78)
            );

            // 將學生清單序列化存檔
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objFile));
            oos.writeObject(students);
            System.out.println("學生資料已序列化存到 " + objFile);

            // 讀回物件檔案並顯示
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objFile));
            List<Student> readStudents = (List<Student>) ois.readObject();
            System.out.println("\n讀回的學生資料：");
            for (Student s : readStudents) {
                System.out.println(s);
            }
            // 輸出成 CSV 格式
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));
            bw.write("姓名,成績");
            bw.newLine();
            for (Student s : readStudents) {
                bw.write(s.getName() + "," + s.getScore());
                bw.newLine();
            }
            System.out.println("學生資料已匯出成 CSV 檔案：" + csvFile);
            // 不在finally關閉資源，就寫在程式最後關閉資源
            oos.close();
            ois.close();
            bw.flush();
            bw.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("反序列化發生錯誤：" + e.getMessage());
        }
    }
}

