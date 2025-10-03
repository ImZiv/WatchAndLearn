package five.part5.advance;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda與集合操作整合
 */
public class Main {
    public static void main(String[] args) {
        // 建立學生清單
        List<Student> students = Arrays.asList(
                new Student("小a", 18, 75),
                new Student("小b", 19, 85),
                new Student("小c", 20, 92),
                new Student("小d", 21, 60),
                new Student("小e", 22, 88)
        );

        // 找出分數大於 80 的學生
        List<Student> highScores = students.stream()
                .filter(s -> s.getScore() > 80)
                .toList();
        System.out.println("分數大於 80 的學生:");
        highScores.forEach(System.out::println);

        // 按分數排序
        List<Student> sortedByScore = students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore())) // 由高到低
                .toList();
        System.out.println("按分數排序 (高 -> 低):");
        sortedByScore.forEach(System.out::println);

        // 計算平均分數
        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);
        System.out.println("學生平均分數: " + average);

    }
}
