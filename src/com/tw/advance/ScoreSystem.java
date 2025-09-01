package com.tw.advance;

public class ScoreSystem {
    public static void main(String[] args) {

        //  1. 宣告三科成績 (int)
        int chinese = 85;
        int english = 70;
        int math = 92;

        //  2. 計算總分與平均 (double)
        int total = chinese + english + math;
        double average = total / 3.0; // 用 3.0 確保是浮點運算

        //  3. 判斷是否及格 (boolean，平均 >= 60)
        boolean isPass = average >= 60;

        //  4. 進階挑戰：判斷等級
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 5. 輸出完整成績報告
        System.out.println("=== 成績分析報告 ===");
        System.out.println("國文：" + chinese);
        System.out.println("英文：" + english);
        System.out.println("數學：" + math);
        System.out.println("-------------------");
        System.out.println("總分：" + total);
        System.out.println("平均：" + average);
        System.out.println("是否及格：" + (isPass ? "及格" : "不及格"));
        System.out.println("等級：" + grade);
    }
}
