package three.part3.basic;

public class EmailProcessor implements MessageProcessor {
    @Override
    public void process(String message) {
        System.out.println("處理 Email 訊息: " + message);
    }
}