package five.part6.basic;

import java.util.Arrays;
import java.util.List;

/**
 * Method Reference基本應用
 */
public class Main {
    public static void main(String[] args) {
        // 1. 建立一個字串清單，使用 Method Reference 進行排序
        List<String> names = Arrays.asList("Tom", "Jerry", "Alice", "Bob");
        System.out.println("原始清單: " + names);


        // 使用 Method Reference 排序
        List<String> sortedByMethodRef = names.stream()
                .sorted(String::compareToIgnoreCase).toList();
        System.out.println("使用 Method Reference 排序: " + sortedByMethodRef);


        // 使用靜態方法引用進行資料轉換
        List<String> numbers = Arrays.asList("1", "2", "3");
        List<Integer> intList = numbers.stream()
                .map(Integer::parseInt) // 靜態方法引用
                .toList();
        System.out.println("靜態方法引用轉換結果: " + intList);


        // Method Reference
        List<Integer> lengthByMethodRef2 = names.stream()
                .map(String::length)
                .toList();
        System.out.println("Method Reference 計算字串長度: " + lengthByMethodRef2);
    }
}
