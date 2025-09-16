package three.part2.advance;

//圓形實作色彩跟縮放大小
public class Circle implements Colorable, Resizable {
    private String color;
    private double radius;

    //設定建構子
    public Circle(double radius) {
        this.radius = radius;
        this.color = "black"; // 預設顏色
    }

    @Override
    public void draw() {
        System.out.println("畫一個 " + color + " 的圓，半徑 = " + radius);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("將圓形設定為顏色: " + color);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("將圓形縮放，新的半徑 = " + radius);
    }
}
