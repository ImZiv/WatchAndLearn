package two.part5.advance;

//子類別 圓形
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("畫一個 " + color + " 的圓形，半徑 = " + radius);
    }
}
