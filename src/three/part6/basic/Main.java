package three.part6.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList基本操作練習
 */
public class Main {
    public static void main(String[] args) {
        // 1. 建立存放整數的 ArrayList
        List<Integer> numbers = new ArrayList<>();

        // 2. 加入 5 個數字
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("初始數字: " + numbers);

        // 3. 列出所有數字
        System.out.println("列出所有數字:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 4. 刪除第 3 個數字 (索引從 0 開始, 第 3 個是 index=2)
        numbers.remove(2);
        System.out.println("刪除第3個數字後: " + numbers);

        // 5. 檢查是否包含某個數字 (例如 40)
        int target = 40;
        if (numbers.contains(target)) {
            System.out.println("包含數字 " + target);
        } else {
            System.out.println("不包含數字 " + target);
        }
    }
}
