package three.part9.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Map基本操作練習
 */
public class Main {
    public static void main(String[] args) {
        // 建立 HashMap 儲存學生姓名和成績
        Map<String, Integer> studentScores = new HashMap<>();

        // 加入5個學生的成績
        studentScores.put("張三", 85);
        studentScores.put("李四", 92);
        studentScores.put("王五", 76);
        studentScores.put("趙六", 88);
        studentScores.put("陳七", 95);

        // 印出所有學生成績
        System.out.println("所有學生成績：" + studentScores);

        // 查詢李四
        String targetStudent = "李四";
        Integer score = studentScores.get(targetStudent);
        System.out.println(targetStudent + " 的成績：" + score);

        // 張三更新為 90
        studentScores.put("張三", 90);
        System.out.println("更新後的成績：" + studentScores);

        // 計算所有學生的平均成績
        double average = studentScores.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("所有學生的平均成績：" + average);
    }
}
