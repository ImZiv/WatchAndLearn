package one.part4.basic;

/**
 * 成績等級判斷
 */
public class GradeJudge {
    public static void main(String[] args) {
        int score = 85; // 可以設定成績體驗看看

        if (score >= 90 && score <= 100) {
            System.out.println("等級: A - 優秀");
        } else if (score >= 80) {
            System.out.println("等級: B - 良好");
        } else if (score >= 70) {
            System.out.println("等級: C - 普通");
        } else if (score >= 60) {
            System.out.println("等級: D - 及格");
        } else if (score >= 0) {
            System.out.println("等級: F - 不及格");
        } else {
            System.out.println("輸入錯誤，成績不能小於 0");
        }
    }
}
