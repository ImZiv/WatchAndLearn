package five.part6.advance;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Lambda效能最佳化實戰
 */
public class Main {
    public static void main(String[] args) {
        // 建立一個大型資料集 (10 萬筆)
        List<Integer> data = IntStream.rangeClosed(1, 100000)
                .boxed()
                .toList();
        System.out.println("資料集大小: " + data.size());

        // 比較 Lambda 和 傳統迴圈的效能，使用long可以裝比較大的數字
        long start, end;

        // 傳統 for 迴圈，這個nanoTime是用來計算時間
        start = System.nanoTime();
        long sumForLoop = 0;
        for (Integer i : data) {
            if (i % 2 == 0) {
                sumForLoop += i;
            }
        }
        end = System.nanoTime();
        System.out.println("傳統 for 迴圈結果: " + sumForLoop + "，耗時: " + (end - start) / 1000000 + " ms");

        // Lambda + Stream
        start = System.nanoTime();
        long sumLambda = data.stream()
                .filter(i -> i % 2 == 0)
                .mapToLong(i -> i)
                .sum();
        end = System.nanoTime();
        System.out.println("Lambda Stream 結果: " + sumLambda + "，耗時: " + (end - start) / 1000000 + " ms");

        // 測試 parallelStream 的效能提升
        start = System.nanoTime();
        long sumParallel = data.parallelStream()
                .filter(i -> i % 2 == 0)
                .mapToLong(i -> i)
                .sum();
        end = System.nanoTime();
        System.out.println("Parallel Stream 結果: " + sumParallel + "，耗時: " + (end - start) / 1000000 + " ms");

        // 分析記憶體使用情況 (簡單估計)
        Runtime runtime = Runtime.getRuntime();
        System.out.println("JVM 總記憶體: " + runtime.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("JVM 空閒記憶體: " + runtime.freeMemory() / 1024 / 1024 + " MB");
        System.out.println("JVM 已使用記憶體: " + (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " MB");

        // 高效資料處理管道 ( 過濾 + 轉換 + 聚合)
        start = System.nanoTime();
        long result = data.parallelStream()
                .filter(i -> i % 3 == 0)       // 過濾 3 的倍數
                .map(i -> i * 2)              // 每個數字 *2
                .mapToLong(i -> i)
                .sum();                       // 相加
        end = System.nanoTime();
        System.out.println("高效資料管道結果: " + result + "，耗時: " + (end - start) / 1000000 + " ms");

    }
}
