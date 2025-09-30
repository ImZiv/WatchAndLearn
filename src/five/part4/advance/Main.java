package five.part4.advance;

/**
 * 包裝類別比較陷阱的解決
 */
public class Main {
    public static void main(String[] args) {
        Integer a = 100;   // 快取範圍內
        Integer b = 100;
        Integer c = 200;   // 超出快取範圍
        Integer d = 200;
        Integer e = null;

        // 測試快取範圍內
        System.out.println("compare(100, 100): " + compareIntegers(a, b)); // true

        // 測試超出快取範圍
        System.out.println("compare(200, 200): " + compareIntegers(c, d)); // true

        // 測試 null
        System.out.println("compare(null, 100): " + compareIntegers(e, a)); // false
        System.out.println("compare(null, null): " + compareIntegers(e, e)); // true
    }

    /**
     * 正確比較兩個 Integer 是否相等
     * 能處理 null 的情況
     */
    public static boolean compareIntegers(Integer x, Integer y) {
        if (x == null && y == null) {
            return true;  // 兩個都是 null 視為相等
        }
        if (x == null || y == null) {
            return false; // 其中一個是 null
        }
        return x.equals(y); // 使用 equals 比較數值
    }
}
