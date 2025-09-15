package two.part5.advance;

//子類別 三角形
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("畫一個 " + color + " 的三角形，底 = " + base + "，高 = " + height);
    }
}
