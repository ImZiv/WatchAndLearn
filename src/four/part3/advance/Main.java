package four.part3.advance;

/**
 * 多重例外處理練習
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("程式開始執行...");

        try {
            //NullPointerException
            String str = null;
            System.out.println(str.length()); // 會拋出 NullPointerException

            // NumberFormatException
            String numStr = "abc";
            int num = Integer.parseInt(numStr); // 會拋出 NumberFormatException
            System.out.println("轉換結果: " + num);

            //ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // 會拋出 ArrayIndexOutOfBoundsException

        } catch (NullPointerException e) {
            System.out.println("捕捉到 NullPointerException！");
            System.out.println("錯誤訊息: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("捕捉到 NumberFormatException！");
            System.out.println("錯誤訊息: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕捉到 ArrayIndexOutOfBoundsException！");
            System.out.println("錯誤訊息: " + e.getMessage());
        } catch (Exception e) {
            // 其他沒預期到的例外
            System.out.println("捕捉到其他例外: " + e.getClass().getSimpleName());
            System.out.println("錯誤訊息: " + e.getMessage());
        }

        System.out.println("程式結束，仍然正常運作。");
    }
}
