package two.part5.advance;

// 測試主程式
public class Main {
    public static void main(String[] args) {
        // 建立多種圖形
        Shape circle = new Circle("紅色", 5.0);
        Shape rectangle = new Rectangle("藍色", 4.0, 6.0);
        Shape triangle = new Triangle("綠色", 3.0, 4.0);

        // 多型應用：用同一個陣列存不同圖形
        Shape[] shapes = {circle, rectangle, triangle};

        // 統一處理
        for (Shape s : shapes) {
            s.draw();
            System.out.println("面積 = " + s.getArea());
            System.out.println("-----------------");
        }
    }
}

