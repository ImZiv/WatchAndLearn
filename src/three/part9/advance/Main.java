package three.part9.advance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 單字頻率統計器
 */
public class Main {
    public static void main(String[] args) {
        // 讀取一段文字(隨便一段文字都行，這裡是為了計數才做成這樣)
        String text = "apple banana apple orange banana apple grape cherry orange banana";

        // 使用 HashMap 統計每個單字出現的次數
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+"); // 以空白分割
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("=== HashMap 統計結果 (無序) ===");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 按出現次數排序 (由大到小)，使用java 8的Stream API + lambda去做操作
        List<Map.Entry<String, Integer>> sortedList = wordCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .toList();

        System.out.println("\n=== 排序後 (由大到小) ===");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 輸出出現次數最多的前 5 個單字
        System.out.println("\n=== 出現最多的前 5 個單字 ===");
        // 使用java 8的Stream API + lambda去做操作
        sortedList.stream().limit(5).forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue())
        );

        // 使用 TreeMap 重新統計（TreeMap 會依照 key 排序）
        Map<String, Integer> treeMap = new TreeMap<>(wordCount);
        System.out.println("\n=== TreeMap 統計結果 (依照 key 排序) ===");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
