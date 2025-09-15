package two.part5.advance;

//子類別 方形
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("畫一個 " + color + " 的矩形，寬 = " + width + "，高 = " + height);
    }
}
