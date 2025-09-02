package one.part5.advance;

/**
 * 圖形繪製程式
 */
public class ShapePrinter {
    public static void main(String[] args) {
        int size = 5; // 圖形大小（行數或邊長）

        //直角三角形
        System.out.println("直角三角形:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //等腰三角形
        System.out.println("等腰三角形:");
        for (int i = 1; i <= size; i++) {
            // 空格
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // 星號
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //矩形
        System.out.println("矩形:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

