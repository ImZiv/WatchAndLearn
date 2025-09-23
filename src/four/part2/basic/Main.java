package four.part2.basic;

import java.util.Arrays;
import java.util.List;

/**
 * 通配符基本使用
 */
public class Main {
    public static void main(String[] args) {
        // 測試 Integer 清單
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("整數清單總和: " + GMethod.sumNumbers(intList));

        // 測試 Double 清單
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("浮點數清單總和: " + GMethod.sumNumbers(doubleList));

        // 測試 Float 清單
        List<Float> floatList = Arrays.asList(2.1f, 3.4f, 5.5f);
        System.out.println("浮點數清單總和: " + GMethod.sumNumbers(floatList));

        // 非數字類型 -> 編譯錯誤
        // List<String> strList = Arrays.asList("a", "b", "c");
        // System.out.println(WildcardSum.sumNumbers(strList)); //編譯不通過
    }
}
