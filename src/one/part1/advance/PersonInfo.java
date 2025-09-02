package one.part1.advance;

/**
 * PersonInfo 類別
 * 這是一個簡單的 Java 範例，用來輸出個人資訊。
 * 功能：
 * - 顯示姓名
 * - 顯示年齡
 * - 顯示興趣
 */
public class PersonInfo {

    public static void main(String[] args) {

        // === 單行註解 (Single-line comment) ===
        // 宣告並初始化個人資訊變數
        String name = "小明";
        int age = 20;
        String hobby = "打籃球";

        /*
         * === 多行註解 (Multi-line comment) ===
         * 使用 System.out.println 來印出個人資訊
         * 每一行輸出一個欄位
         */
        System.out.println("=== 個人資訊顯示程式 ===");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age);
        System.out.println("興趣：" + hobby);
    }
}

