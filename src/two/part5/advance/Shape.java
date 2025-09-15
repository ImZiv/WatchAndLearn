package two.part5.advance;

/**
 * 圖形繪製系統
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // 抽象方法 - 計算面積
    public abstract double getArea();

    // 抽象方法 - 畫圖
    public abstract void draw();
}
