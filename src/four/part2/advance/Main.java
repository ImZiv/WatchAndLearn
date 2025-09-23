package four.part2.advance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * PECS原則實踐
 */
public class Main {
    public static void main(String[] args) {
        // 測試 copyAll
        List<Integer> intList = new ArrayList<>();
        Collection<Number> numCollection = new ArrayList<>();

        CollectionUtils.addAll(intList, 1, 2, 3, 4, 5);
        System.out.println("整數清單: " + intList);

        // copyAll: Integer → Number (Producer Extends, Consumer Super)
        CollectionUtils.copyAll(numCollection, intList);
        System.out.println("數字集合 (copyAll 後): " + numCollection);

        // 測試 addAll
        List<Object> objList = new ArrayList<>();
        CollectionUtils.addAll(objList, "Hello", "World", 123, 45.6);
        System.out.println("物件清單: " + objList);

        // 再次 copyAll: Number → Object
        CollectionUtils.copyAll(objList, numCollection);
        System.out.println("物件清單 (copyAll 後): " + objList);
    }
}
