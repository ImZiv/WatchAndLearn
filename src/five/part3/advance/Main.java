package five.part3.advance;

/**
 * 包裝類別綜合應用
 */
public class Main {
    public static void main(String[] args) {
        // 測試不同情況
        System.out.println("輸入 5 → " + safeSquare(5));     // 預期 25
        System.out.println("輸入 null → " + safeSquare(null)); // 預期 0
        System.out.println("輸入 50000 → " + safeSquare(50000)); // 預期 -1 (超出範圍)
    }

    /**
     * 接收一個可能為 null 的 Integer
     * 如果為 null，回傳 0
     * 如果不為 null，回傳平方值
     * 如果超出合理範圍 (避免溢位)，回傳 -1
     */
    public static int safeSquare(Integer num) {
        // 檢查是否為 null
        if (num == null) {
            return 0;
        }

        // 邊界檢查：避免平方超出 int 最大值
        // int 最大值 = 2147483647，所以平方根約等於 46340
        if (num > 46340 || num < -46340) {
            return -1;
        }

        // 計算平方
        return num * num;
    }
}
