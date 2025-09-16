package three.part3.advance;

/**
 * 函數式介面計算器
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 使用 Lambda 建立不同運算
        Operation add = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;

        // 使用匿名類別覆寫 describe()，展示進階功能
        Operation addWithDesc = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }

            @Override
            public String describe() {
                return "加法";
            }
        };

        System.out.println("結果: " + calculator.execute(5, 3, addWithDesc));
        System.out.println("結果: " + calculator.execute(10, 4, subtract));
        System.out.println("結果: " + calculator.execute(6, 7, multiply));
    }
}
