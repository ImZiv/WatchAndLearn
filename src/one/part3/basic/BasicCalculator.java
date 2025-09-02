package one.part3.basic;

/**
 * 基本計算器
 */
public class BasicCalculator {
    public static void main(String[] args) {
        int a = 10; // 第一個數字
        int b = 3;  // 第二個數字

        // 基本四則運算
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b; // 整數除法
        int mod = a % b;  // 取餘數

        // 複合賦值運算子
        int x = a;
        x += b; // 等同於 x = x + b
        int y = a;
        y *= b; // 等同於 y = y * b

        // 輸出結果
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("加法: " + sum);
        System.out.println("減法: " + diff);
        System.out.println("乘法: " + prod);
        System.out.println("除法: " + quot);
        System.out.println("取餘數: " + mod);
        System.out.println("x += b 結果: " + x);
        System.out.println("y *= b 結果: " + y);
    }
}
