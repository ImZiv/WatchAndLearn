package one.part8.basic;

public class StringFamilyCompare {
    public static void main(String[] args) {
        int times = 100000; // 拼接次數，可以改大一點測試差異

        // 使用 String
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < times; i++) {
            str += "Hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("String 耗時: " + (end - start) + " ms");

        // 使用 StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append("Hello");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer 耗時: " + (end - start) + " ms");

        // 使用 StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sbd.append("Hello");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder 耗時: " + (end - start) + " ms");
    }
}

