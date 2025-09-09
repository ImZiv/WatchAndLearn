package two.part2.advance;

/**
 * 銀行帳戶
 */
public class BankAccount {
    private String accountNumber;   // 帳號
    private double balance;         // 餘額
    private String password;        // 密碼
    private String[] transactions;  // 固定大小的交易紀錄陣列
    private int transactionCount;   // 已經記錄的筆數

    // 建構子
    public BankAccount(String accountNumber, String password, double initialBalance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = initialBalance;
        this.transactions = new String[100]; // 最多存 100 筆交易紀錄
        this.transactionCount = 0;
        addTransaction("帳戶建立，初始餘額：" + initialBalance);
    }

    // 加入交易紀錄
    private void addTransaction(String record) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount] = record;
            transactionCount++;
        }
    }

    // 驗證密碼
    private boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // 存款
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("存款：" + amount + "，餘額：" + balance);
        } else {
            System.out.println("存款金額必須大於0");
        }
    }

    // 提款
    public void withdraw(double amount, String inputPassword) {
        if (!authenticate(inputPassword)) {
            System.out.println("密碼錯誤，提款失敗！");
            //這裡return 之後，下面的程式就不執行了
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("提款：" + amount + "，餘額：" + balance);
        } else {
            System.out.println("提款金額錯誤或餘額不足！");
        }
    }

    // 查詢餘額
    public double getBalance(String inputPassword) {
        if (!authenticate(inputPassword)) {
            System.out.println("密碼錯誤，無法查詢餘額！");
            //通常負數就是代表不存在或是失敗，也可以用其他數字像是9527之類的，只是會被罵
            return -1;
        }
        return balance;
    }

    // 顯示交易紀錄
    public void printTransactions() {
        System.out.println("交易紀錄：");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }
}
