package three.part5.basic;
//運輸的列舉
public enum Transport {
    CAR(80, 5),
    TRAIN(120, 300),
    AIRPLANE(900, 180);

    private final int speed;     // 速度
    private final int capacity;  // 載客量

    // 建構子
    Transport(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    // Getter 方法
    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    // 判斷是否為高速交通工具 (速度 > 100)
    public boolean isHighSpeed() {
        return this.speed > 100;
    }
}

