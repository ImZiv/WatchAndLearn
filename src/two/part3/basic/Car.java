package two.part3.basic;

// 子類別 Car
public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String color, int doors) {
        super(brand, color); // 呼叫父類別建構子
        this.doors = doors;
    }

    //鳴笛
    public void honk() {
        System.out.println(brand + " 車按下喇叭：叭叭！");
    }

    @Override
    public String toString() {
        return super.toString() + "，車門數: " + doors;
    }
}

