package three.part2.basic;

/**
 * 智慧型手機功能介面
 */
public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        // 測試打電話
        myPhone.call("0987654321");

        // 測試拍照
        myPhone.takePicture();

        // 測試播放音樂
        myPhone.playMusic("Shape of You");
    }
}
