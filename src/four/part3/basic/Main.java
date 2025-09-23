package four.part3.basic;

/**
 * 熟悉try-catch基本語法
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("程式開始執行...");

        try {
            //除0錯誤
            int a = 10;
            int b = 0; // 這裡會造成除零例外
            int result = a / b;

            System.out.println("計算結果: " + result);

        } catch (ArithmeticException e) {
            //捕捉 ArithmeticException
            System.out.println("錯誤：除數不能為零！");
            //印出錯誤的堆疊
            e.printStackTrace();
        }

        // 確認程式仍能繼續執行
        System.out.println("程式結束，仍然正常運作。");
    }
}
