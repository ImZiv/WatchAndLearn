package two.part3.basic;

// 子類別 Motorcycle
public class Motorcycle extends Vehicle {
    private int engineCC;

    public Motorcycle(String brand, String color, int engineCC) {
        super(brand, color);
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return super.toString() + "，排氣量: " + engineCC + "cc";
    }
}