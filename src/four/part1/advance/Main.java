package four.part1.advance;

/**
 * 建立一個泛型方法 swap()
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("=== 交換前String 陣列===");
        for (String name : names) {
            System.out.print(name + " ");
        }

        SwapUtil.swap(names, 0, 2);

        System.out.println("=== 交換後String 陣列===");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // Integer 陣列
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("=== 交換前Integer 陣列 ===");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        SwapUtil.swap(numbers, 1, 3);

        System.out.println("=== 交換後Integer 陣列 ===");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
