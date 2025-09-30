package five.part4.basic;

/**
 * 自動裝箱拆箱基本操作
 */
public class Main {
    public static void main(String[] args) {
        // 自動裝箱
        Integer num1 = 10;
        System.out.println("num1 的值: " + num1);

        // 自動拆箱
        int value = num1;
        System.out.println("value 的值: " + value);

        // 測試快取範圍內的 == 比較 (-128 ~ 127 會快取)
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b (100, 快取範圍內): " + (a == b)); // true
        System.out.println("a.equals(b): " + a.equals(b)); // true (數值比較)

        // 測試超出快取範圍的 == 比較
        Integer c = 200;
        Integer d = 200;
        System.out.println("c == d (200, 超出快取範圍): " + (c == d)); // false
        System.out.println("c.equals(d): " + c.equals(d)); // true (數值比較)

    }
}
