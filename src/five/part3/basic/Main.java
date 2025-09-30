package five.part3.basic;

/**
 * 基本包裝類別操作
 */
public class Main {
    public static void main(String[] args) {
        // 建立 Integer 物件並指定值 100
        Integer num1 = Integer.valueOf(100);

        // 將字串 "250" 轉換為 Integer
        Integer num2 = Integer.parseInt("250");

        // 比較兩個 Integer 物件是否相等
        if (num1.equals(num2)) {
            System.out.println("num1 和 num2 相等");
        } else {
            System.out.println("num1 和 num2 不相等");
        }

        // 取得 Integer 的最大值和最小值
        System.out.println("Integer 最大值 = " + Integer.MAX_VALUE);
        System.out.println("Integer 最小值 = " + Integer.MIN_VALUE);
    }
}
