package two.part2.advance;

/**
 * 程式進入點
 */
public class Main {
    public static void main(String[] args) {
        // 建立帳戶
        BankAccount account = new BankAccount("123456", "abc123", 1000);

        // 存款
        account.deposit(500);

        // 提款（密碼錯誤）
        account.withdraw(300, "wrong");

        // 提款（正確密碼）
        account.withdraw(200, "abc123");

        // 查詢餘額（正確密碼）
        System.out.println("目前餘額：" + account.getBalance("abc123"));

        // 顯示交易紀錄
        account.printTransactions();
    }
}

