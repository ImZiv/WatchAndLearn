package two.part3.basic;

/**
 * 程式進入點
 */
public class Main {
    public static void main(String[] args) {
        // 建立 Car 物件
        Car car = new Car("Toyota", "紅色", 4);
        car.start();
        car.honk();
        System.out.println(car);

        System.out.println("-------------------");

        // 建立 Motorcycle 物件
        Motorcycle moto = new Motorcycle("Yamaha", "黑色", 150);
        moto.start();
        System.out.println(moto);
    }
}
