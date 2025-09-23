package four.part2.basic;

import java.util.List;

public class GMethod {
    // 使用上界通配符，確保List只能放Number或其子類型
    public static double sumNumbers(List<? extends Number> numbers) {
        double total = 0;
        for (Number num : numbers) {
            total += num.doubleValue();
        }
        return total;
    }
}
