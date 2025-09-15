package three.part1.advance;

// 直升機同時具備移動與飛行能力
public class Helicopter implements Movable, Flyable {
    private String model;

    public Helicopter(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println(model + " 移動。");
    }

    @Override
    public void fly() {
        System.out.println(model + " 起飛");
    }
}
