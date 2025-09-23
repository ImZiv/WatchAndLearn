package four.part1.basic;

/**
 * 建立一個泛型類別 SimpleBox
 */
public class Main {
    public static void main(String[] args) {
        // String的 SimpleBox
        SimpleBox<String> stringBox = new SimpleBox<>();
        stringBox.set("Hello, world");
        System.out.println("StringBox 內容: " + stringBox.get());

        // Integer的 SimpleBox
        SimpleBox<Integer> intBox = new SimpleBox<>();
        intBox.set(2025);
        System.out.println("IntegerBox 內容: " + intBox.get());

        // Double的 SimpleBox
        SimpleBox<Double> doubleBox = new SimpleBox<>();
        doubleBox.set(3.14159);
        System.out.println("DoubleBox 內容: " + doubleBox.get());
    }
}
