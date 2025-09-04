package one.part7.basic;

public class StudentScore {
    public static void main(String[] args) {
        // 這裡面的值你可以隨便換
        int[] scores = {80, 55, 90, 70, 65};

        // 初始化
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        int passCount = 0;

        // 使用迴圈統計資料
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            sum += score;
            if (score >= 60) {
                passCount++;
            }
        }

        double avg = sum / (double) scores.length;

        //  輸出結果
        System.out.println("=== 成績統計報告 ===");
        System.out.println("最高分: " + max);
        System.out.println("最低分: " + min);
        System.out.println("平均分: " + String.format("%.2f", avg));
        System.out.println("及格人數: " + passCount + " / " + scores.length);
    }
}