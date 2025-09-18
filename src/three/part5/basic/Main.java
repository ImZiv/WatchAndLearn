package three.part5.basic;

/**
 * 建立帶屬性的交通工具列舉
 */
public class Main {
    public static void main(String[] args) {
        // 測試所有交通工具
        for (Transport t : Transport.values()) {
            System.out.println("交通工具: " + t);
            System.out.println("速度: " + t.getSpeed() + " km/h");
            System.out.println("載客量: " + t.getCapacity() + " 人");
            System.out.println("是否為高速交通工具? " + (t.isHighSpeed() ? "是" : "否"));
            System.out.println("------------------------");
        }
    }
}
