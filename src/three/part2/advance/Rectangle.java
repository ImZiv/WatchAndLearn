package three.part2.advance;

//方形實作色彩跟縮放大小
public class Rectangle implements Colorable, Resizable {
    private String color;
    private double width;
    private double height;

    //設定建構子
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "black";
    }

    @Override
    public void draw() {
        System.out.println("畫一個 " + color + " 的矩形，寬 = " + width + " 高 = " + height);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("將矩形設定為顏色: " + color);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("將矩形縮放，新的寬 = " + width + " 高 = " + height);
    }
}
