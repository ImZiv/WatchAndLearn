package com.tw.basic;

/**
 * 宣告姓名、年齡、身高、是否學生變數
 * 為每個變數賦予適當的值
 * 使用System.out.println輸出資訊
 * 練習不同資料型別的使用
 */
public class PersonalInfo {
    public static void main(String[] args) {
        // 1. 宣告變數
        String name = "小明";   // 姓名 → 使用 String
        int age = 20;          // 年齡 → 使用 int
        double height = 175.5; // 身高 (公分) → 使用 double
        boolean isStudent = true; // 是否學生 → 使用 boolean

        // 2. 輸出結果
        System.out.println("個人資料：");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age + " 歲");
        System.out.println("身高：" + height + " 公分");
        System.out.println("是否為學生：" + isStudent);
    }
}
