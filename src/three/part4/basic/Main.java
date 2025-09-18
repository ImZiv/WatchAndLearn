package three.part4.basic;

/**
 * 建立星期列舉並練習基本操作
 */
public class Main {
    public static void main(String[] args) {
        // 1. 使用 values() 印出所有星期
        System.out.println("所有星期：");
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day);
        }

        // 2. 使用 valueOf() 將字串轉換為列舉
        WeekDay sunday = WeekDay.valueOf("SUNDAY");
        System.out.println("字串 SUNDAY 轉換成列舉: " + sunday);

        // 3. 使用 ordinal() 取得星期的順序編號
        System.out.println("SUNDAY 的 ordinal 編號: " + sunday.ordinal());
    }
}

