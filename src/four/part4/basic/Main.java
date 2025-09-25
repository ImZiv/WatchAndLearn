package four.part4.basic;

/**
 * finally區塊資源清理
 */
public class Main {
    public static void main(String[] args) {
        String resource = null;
        try {
            System.out.println("開啟資源...");
            resource = "檔案資源"; // 模擬開啟檔案

            // 模擬例外狀況
            int result = 10 / 0; // 故意除以零
            System.out.println("處理資源：" + resource);
        } catch (ArithmeticException e) {
            System.out.println("捕捉到例外：" + e.getMessage());
        } finally {
            System.out.println("關閉資源...");
        }

        System.out.println("程式結束");
    }

}
