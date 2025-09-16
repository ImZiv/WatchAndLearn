package three.part3.basic;

/**
 * 訊息處理器介面
 */
public class Main {
    public static void main(String[] args) {
        EmailProcessor emailProcessor = new EmailProcessor();

        // 呼叫預設方法
        emailProcessor.preProcess();

        // 測試訊息
        String msg1 = "Hello, this is an email.";
        String msg2 = "";

        // 呼叫靜態方法驗證
        if (MessageProcessor.validateMessage(msg1)) {
            emailProcessor.process(msg1);
        } else {
            System.out.println("訊息無效 (空白)");
        }

        if (MessageProcessor.validateMessage(msg2)) {
            emailProcessor.process(msg2);
        } else {
            System.out.println("訊息無效 (空白)");
        }
    }
}

