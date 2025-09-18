package three.part7.advance;

import java.util.*;

/**
 * 三種Set比較實驗
 */
public class Main {
    public static void main(String[] args) {
        // 測試用字串
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David", "Alice");

        // 1. 分別建立三種 Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // 2. 插入相同順序的元素
        for (String name : names) {
            hashSet.add(name);
            treeSet.add(name);
            linkedHashSet.add(name);
        }

        // 3. 比較輸出順序
        System.out.println("HashSet (無序)：" + hashSet);
        System.out.println("TreeSet (自動排序)：" + treeSet);
        System.out.println("LinkedHashSet (插入順序)：" + linkedHashSet);

        // 4. 測試效能差異（簡單測試 contains）
        long start, end;

        start = System.nanoTime();
        hashSet.contains("Alice");
        end = System.nanoTime();
        System.out.println("HashSet contains() 花費：" + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains("Alice");
        end = System.nanoTime();
        System.out.println("TreeSet contains() 花費：" + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains("Alice");
        end = System.nanoTime();
        System.out.println("LinkedHashSet contains() 花費：" + (end - start) + " ns");

        // 5. 示範聯集與交集
        Set<String> setA = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Set<String> setB = new HashSet<>(Arrays.asList("Bob", "David", "Eve"));

        // 聯集
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("聯集：" + union);

        // 交集
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("交集：" + intersection);
    }
}
