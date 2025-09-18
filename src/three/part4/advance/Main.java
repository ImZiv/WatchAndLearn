package three.part4.advance;

/**
 * 建立學生成績等級列舉系統
 */
public class Main {
    public static void main(String[] args) {
        // 測試不同分數
        int[] scores = {95, 82, 76, 61, 40};

        for (int score : scores) {
            Grade grade = Grade.getGradeByScore(score);
            System.out.println("分數: " + score + " → 等級: " + grade);
            grade.printMessage();
            System.out.println("-------------------");
        }
    }
}
