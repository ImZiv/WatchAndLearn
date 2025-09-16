package three.part2.advance;

/**
 * 圖形繪製系統
 */
public class Main {
    public static void main(String[] args) {
        // 建立不同圖形
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // 用陣列存放
        Drawable[] shapes = {circle, rectangle};

        // 呼叫方法
        for (Drawable shape : shapes) {
            shape.draw();

            if (shape instanceof Colorable) {
                ((Colorable) shape).setColor("red");
            }
            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(1.5);
            }

            shape.draw();
            System.out.println("-----");
        }
    }
}
