package three.part3.basic;

public interface MessageProcessor {
    // 抽象方法
    void process(String message);

    // 預設方法記得要加「default」
    default void preProcess() {
        System.out.println("前置處理");
    }

    // 靜態方法
    static boolean validateMessage(String message) {
        return message != null && !message.isEmpty();
    }
}