package one.part6.basic;

import java.util.Scanner;

/**
 *密碼驗證系統
 */
public class PasswordCheck {
    public static void main(String[] args) {
        String password = "java123"; // 預設密碼
        String input = "";
        Scanner scanner = new Scanner(System.in);

        // 當輸入不等於密碼時，持續要求輸入
        while (!input.equals(password)) {
            System.out.print("請輸入密碼: ");
            input = scanner.nextLine();

            if (!input.equals(password)) {
                System.out.println("密碼錯誤！請重新輸入。");
            }
        }

        System.out.println("登入成功！");
        scanner.close();
    }
}
