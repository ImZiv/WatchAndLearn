package three.part6.advance;

import java.util.ArrayList;
import java.util.List;

/**
 * 學生成績管理系統
 */
public class Main {
    public static void main(String[] args) {
        // 1. 建立學生姓名 ArrayList
        List<String> students = new ArrayList<>();
        // 2. 建立對應成績 ArrayList
        List<Integer> scores = new ArrayList<>();

        // 3. 新增學生 (寫死範例)
        students.add("張三");
        scores.add(85);
        students.add("李四");
        scores.add(92);
        students.add("王五");
        scores.add(76);

        System.out.println("=== 初始名單 ===");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " - " + scores.get(i));
        }

        // 4. 新增新學生
        students.add("趙六");
        scores.add(88);
        System.out.println("=== 新增學生後 ===");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " - " + scores.get(i));
        }

        // 5. 刪除學生 (刪除王五)
        int index = students.indexOf("王五");
        //如果不包含在list裡面，值會是-1，所以這裡判斷有找到再刪除
        if (index != -1) {
            students.remove(index);
            scores.remove(index);
        }
        System.out.println("=== 刪除王五後 ===");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " - " + scores.get(i));
        }

        // 6. 成績排序 (由高到低)
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) indices.add(i);
        //使用lambda的表示方式
        indices.sort((i1, i2) -> scores.get(i2) - scores.get(i1));

        System.out.println("=== 成績排序後 ===");
        for (int idx : indices) {
            System.out.println(students.get(idx) + " - " + scores.get(idx));
        }

        // 7. 搜尋學生 (搜尋李四)
        String searchName = "李四";
        int idx = students.indexOf(searchName);
        System.out.println("=== 搜尋結果 ===");
        if (idx != -1) {
            System.out.println(searchName + " 的成績是: " + scores.get(idx));
        } else {
            System.out.println("找不到 " + searchName);
        }
    }
}
