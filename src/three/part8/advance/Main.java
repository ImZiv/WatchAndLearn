package three.part8.advance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 效能比較實驗
 */
public class Main {
    public static void main(String[] args) {
        // 建立元素數量，因為固定常數，所以使用final，下面都一樣
        final int ELEMENTS = 1000;
        // 存取次數
        final int ACCESS_TIMES = 1000;
        // 刪除元素數量
        final int DELETE_COUNT = 500;

        // 建立 ArrayList 與 LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("=== 效能比較實驗開始 ===");

        // 插入測試：在開頭插入 1000 個元素
        System.out.println("\n[插入測試]");
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList 插入時間：" + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList 插入時間：" + (end - start) / 1_000_000.0 + " ms");

        // 存取測試：隨機存取 1000 次
        System.out.println("\n[存取測試]");
        Random rand = new Random();
        start = System.nanoTime();
        for (int i = 0; i < ACCESS_TIMES; i++) {
            int index = rand.nextInt(arrayList.size());
            arrayList.get(index);
        }
        end = System.nanoTime();
        System.out.println("ArrayList 存取時間：" + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < ACCESS_TIMES; i++) {
            int index = rand.nextInt(linkedList.size());
            linkedList.get(index);
        }
        end = System.nanoTime();
        System.out.println("LinkedList 存取時間：" + (end - start) / 1000000.0 + " ms");

        // 刪除測試：從中間刪除 500 個元素
        System.out.println("\n[刪除測試]");
        start = System.nanoTime();
        for (int i = 0; i < DELETE_COUNT; i++) {
            int mid = arrayList.size() / 2;
            arrayList.remove(mid);
        }
        end = System.nanoTime();
        System.out.println("ArrayList 刪除時間：" + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < DELETE_COUNT; i++) {
            int mid = linkedList.size() / 2;
            linkedList.remove(mid);
        }
        end = System.nanoTime();
        System.out.println("LinkedList 刪除時間：" + (end - start) / 1000000.0 + " ms");

        System.out.println("\n=== 效能比較實驗結束 ===");
    }
}

