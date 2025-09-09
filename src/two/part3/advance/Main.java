package two.part3.advance;

/**
 * 程式進入點
 * 員工管理系統
 */
public class Main {
    public static void main(String[] args) {
        // 建立 Manager 物件
        Manager manager = new Manager("小王", 40, "M001", 80000, "研發部");
        System.out.println(manager.toString());

        // 建立 Developer 物件
        Developer dev = new Developer("小李", 28, "D001", 60000, "Java");
        System.out.println(dev.toString());

        // equals 測試
        Developer dev2 = new Developer("小李", 28, "D001", 60000, "Java");
        System.out.println("dev 與 dev2 是否相同: " + dev.equals(dev2));
    }
}
