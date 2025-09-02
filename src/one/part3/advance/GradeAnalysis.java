package one.part3.advance;

/**
 * 成績分析系統
 */
public class GradeAnalysis {
    public static void main(String[] args) {
        // 三科成績（自行設定）
        int chinese = 92;
        int math = 81;
        int english = 74;

        //總分與平均
        int total = chinese + math + english;
        // 有小數點記得使用double
        double avg = total / 3.0;

        //等級（A:90, B:80, C:70, D:60, F:其餘）
        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // 是否及格（平均 >= 60）
        boolean pass = avg >= 60;

        // 與滿分差距（個別科目、總分）
        int gapChi = 100 - chinese;
        int gapMath = 100 - math;
        int gapEng = 100 - english;
        int gapTotal = 300 - total; // 三科滿分 300

        // 輸出結果
        System.out.println("=== 成績分析報告 ===");
        System.out.println("國文: " + chinese + "（差滿分 " + gapChi + " 分）");
        System.out.println("數學: " + math + "（差滿分 " + gapMath + " 分）");
        System.out.println("英文: " + english + "（差滿分 " + gapEng + " 分）");
        System.out.println("總分: " + total + " / 300（差滿分 " + gapTotal + " 分）");
        System.out.println("平均: " + String.format("%.2f", avg));
        System.out.println("等級: " + grade);
        System.out.println("是否及格(平均>=60): " + (pass ? "及格" : "不及格"));

        // 進階挑戰：獎學金資格（範例條件：平均>=90 且 各科>=80）
        boolean scholarship = avg >= 90 && chinese >= 80 && math >= 80 && english >= 80;
        System.out.println("獎學金資格: " + (scholarship ? "符合" : "未符合"));
    }
}
