package one.part6.advance;

import java.util.Random;
import java.util.Scanner;

/**
 * 數字遊戲選單
 */
public class NumberGameMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice;

        do {
            // 選單
            System.out.println("\n=== 數字遊戲選單 ===");
            System.out.println("1. 猜數字遊戲");
            System.out.println("2. 簡單計算機");
            System.out.println("3. 退出");
            System.out.print("請選擇功能 (1-3): ");

            // 驗證輸入
            while (!scanner.hasNextInt()) {
                System.out.println("請輸入數字！");
                scanner.next(); // 丟掉錯誤輸入
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // 猜數字遊戲
                    int answer = random.nextInt(100) + 1; // 1~100
                    int guess = -1;
                    System.out.println("=== 猜數字遊戲開始! (1~100) ===");
                    while (guess != answer) {
                        System.out.print("請輸入你的猜測: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("請輸入有效數字！");
                            scanner.next();
                        }
                        guess = scanner.nextInt();

                        if (guess > answer) {
                            System.out.println("太大了！");
                        } else if (guess < answer) {
                            System.out.println("太小了！");
                        } else {
                            System.out.println("恭喜答對！");
                        }
                    }
                    break;

                case 2:
                    // 簡單計算機
                    System.out.print("請輸入第一個數字: ");
                    double a = scanner.nextDouble();
                    System.out.print("請輸入第二個數字: ");
                    double b = scanner.nextDouble();
                    System.out.print("請輸入運算符號 (+ - * /): ");
                    char op = scanner.next().charAt(0);

                    if (op == '+') System.out.println("結果 = " + (a + b));
                    else if (op == '-') System.out.println("結果 = " + (a - b));
                    else if (op == '*') System.out.println("結果 = " + (a * b));
                    else if (op == '/') {
                        if (b != 0) System.out.println("結果 = " + (a / b));
                        else System.out.println("錯誤: 除數不能為 0");
                    } else System.out.println("錯誤: 無效的運算符號");
                    break;

                case 3:
                    System.out.println("遊戲結束，再見！");
                    break;

                default:
                    System.out.println("錯誤: 請輸入 1~3 之間的選項。");
            }

        } while (choice != 3);

        scanner.close();
    }
}
