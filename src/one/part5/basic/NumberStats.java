package one.part5.basic;

/**
 * 數字統計程式
 */
public class NumberStats {
    public static void main(String[] args) {
        int sum = 0;          // 總和
        int evenCount = 0;    // 偶數個數
        String divisibleBy3 = ""; // 被 3 整除的數字

        for (int i = 1; i <= 50; i++) {
            sum += i; // 累加總和

            if (i % 2 == 0) {
                evenCount++; // 偶數統計
            }

            if (i % 3 == 0) {
                divisibleBy3 += i + " "; // 收集能被 3 整除的數字
            }
        }
        // 輸出結果
        System.out.println("1 到 50 的總和 = " + sum);
        System.out.println("1 到 50 偶數的個數 = " + evenCount);
        System.out.println("1 到 50 能被 3 整除的數字 = " + divisibleBy3);
    }
}

