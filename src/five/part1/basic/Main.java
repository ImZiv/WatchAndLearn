package five.part1.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 學生成績統計系統
 */
public class Main {
    public static void main(String[] args) {
        // 建立學生資料
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 58);
        students.put("Charlie", 73);
        students.put("David", 92);
        students.put("Eva", 60);

        // 使用 filter (分數 >= 60)
        Map<String, Integer> passed = students.entrySet().stream()
                .filter(s -> s.getValue() >= 60)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        // 使用map，entrySet就是同時取出key/value
        List<String> gradeList = passed.entrySet().stream()
                .map(s -> s.getKey() + " - " + toGrade(s.getValue()))
                .toList();

        // 使用sorted(由高到低)
        List<Map.Entry<String, Integer>> sorted = passed.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue() - s1.getValue())
                .toList();

        // 輸出結果
        System.out.println("=== 及格學生 ===");
        sorted.forEach(s -> System.out.println(s.getKey() + " (" + s.getValue() + ")"));

        System.out.println("=== 學生成績表 ===");
        gradeList.forEach(System.out::println);
    }

    // 工具方法：分數轉換成等級
    private static String toGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

}
