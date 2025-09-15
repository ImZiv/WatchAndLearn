package three.part1.advance;

// 汽車只具備移動能力
public class Car implements Movable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println(brand + " 移動");
    }
}
