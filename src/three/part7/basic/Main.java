package three.part7.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * Set基本操作練習
 */
public class Main {
    public static void main(String[] args) {
        // 1. 建立 HashSet 儲存學生姓名
        Set<String> students = new HashSet<>();

        // 2. 加入 5 個學生，其中 2 個重複
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice");
        students.add("David");

        // 3. 檢查某個學生是否存在
        String target = "Bob";
        if (students.contains(target)) {
            System.out.println(target + " 存在於集合中");
        } else {
            System.out.println(target + " 不存在於集合中");
        }

        // 4. 遍歷並輸出所有學生
        System.out.println("目前學生名單：");
        for (String name : students) {
            System.out.println(name);
        }

        // 5. 觀察重複元素的處理結果
        System.out.println("學生總數：" + students.size());
    }
}

