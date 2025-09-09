package two.part3.basic;

// 父類別 Vehicle
public class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void start() {
        System.out.println(brand + " 車已啟動！");
    }

    //覆寫toString
    @Override
    public String toString() {
        return "品牌: " + brand + "，顏色: " + color;
    }
}
