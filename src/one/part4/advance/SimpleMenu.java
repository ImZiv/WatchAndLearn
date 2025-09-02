package one.part4.advance;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 顯示功能選單
        System.out.println("\n=== 簡單選單系統 ===");
        System.out.println("1. 計算機");
        System.out.println("2. 成績查詢");
        System.out.println("3. 退出");
        System.out.print("請輸入選項 (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // 計算機
                System.out.print("請輸入第一個數字: ");
                double a = scanner.nextDouble();
                System.out.print("請輸入第二個數字: ");
                double b = scanner.nextDouble();
                System.out.print("請輸入運算符號 (+ - * /): ");
                char op = scanner.next().charAt(0);

                if (op == '+') {
                    System.out.println("結果 = " + (a + b));
                } else if (op == '-') {
                    System.out.println("結果 = " + (a - b));
                } else if (op == '*') {
                    System.out.println("結果 = " + (a * b));
                } else if (op == '/') {
                    if (b != 0) {
                        System.out.println("結果 = " + (a / b));
                    } else {
                        System.out.println("錯誤: 除數不能為 0");
                    }
                } else {
                    System.out.println("錯誤: 無效的運算符號");
                }
                break;

            case 2: // 成績查詢
                System.out.print("請輸入分數 (0-100): ");
                int score = scanner.nextInt();

                if (score >= 90 && score <= 100) {
                    System.out.println("等級: A");
                } else if (score >= 80) {
                    System.out.println("等級: B");
                } else if (score >= 70) {
                    System.out.println("等級: C");
                } else if (score >= 60) {
                    System.out.println("等級: D");
                } else if (score >= 0) {
                    System.out.println("等級: F");
                } else {
                    System.out.println("錯誤: 分數輸入無效");
                }
                break;

            case 3: // 退出
                System.out.println("系統結束，再見！");
                break;

            default:
                System.out.println("錯誤: 請輸入 1 ~ 3 的選項");
        }

        scanner.close();
    }
}
