package four.part4.advance;

/**
 * 自訂例外與throw練習
 */
public class Main {
    public static void main(String[] args) {
        Integer score = null; // 測試不同情況：可以改成 85, -10, null

        try {
            // 模擬啟用資源
            System.out.println("開始檢查分數...");

            if (score == null) {
                throw new StudentException("分數不能為空！");
            } else if (score < 0 || score > 100) {
                throw new StudentException("分數必須在 0 到 100 之間！");
            } else {
                System.out.println("分數有效：" + score);
            }

        } catch (StudentException e) {
            System.out.println("捕捉到 StudentException：" + e.getMessage());
        } finally {
            // 無論是否發生例外，都會執行
            System.out.println("finally 區塊：釋放資源，結束檢查。");
        }
    }
}
