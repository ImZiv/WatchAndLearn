package five.part5.basic;

/**
 * Lambda基本語法練習
 */
public class Main {
    public static void main(String[] args) {
        // 使用 Lambda 來實作
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        //  測試結果
        int a = 10, b = 5;

        System.out.println("加法: " + a + " + " + b + " = " + add.calculate(a, b));
        System.out.println("減法: " + a + " - " + b + " = " + subtract.calculate(a, b));
        System.out.println("乘法: " + a + " * " + b + " = " + multiply.calculate(a, b));
    }
}
