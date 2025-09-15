package three.part1.advance;

/**
 * 交通工具介面系統
 */
public class Main {
    public static void main(String[] args) {
        // 建立物件
        Movable car = new Car("Toyota");
        Helicopter helicopter = new Helicopter("阿帕契");

        // 使用介面呼叫方法
        car.move();

        helicopter.move();
        helicopter.fly();

        // 都有繼承Movable，所以可以放一起
        Movable[] movables = {car, helicopter};
        for (Movable m : movables) {
            m.move();
        }
    }
}
