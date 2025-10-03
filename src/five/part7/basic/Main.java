package five.part7.basic;

import java.util.Optional;

/**
 * 基礎Optional操作練習
 */
public class Main {

    public static void main(String[] args) {

        // 建立一個包含字串 "Hello" 的 Optional 物件
        Optional<String> optionalHello = Optional.of("Hello");

        // 建立一個空的 Optional 物件
        Optional<String> optionalEmpty = Optional.empty();

        // 使用 isPresent() 方法檢查 Optional 是否有值
        if (optionalHello.isPresent()) {
            System.out.println("optionalHello 有值");
        } else {
            System.out.println("optionalHello 沒有值");
        }

        if (optionalEmpty.isPresent()) {
            System.out.println("optionalEmpty 有值");
        } else {
            System.out.println("optionalEmpty 沒有值");
        }

        // 使用 orElse() 方法提供預設值 "Default"
        String value1 = optionalHello.orElse("Default");
        String value2 = optionalEmpty.orElse("Default");

        System.out.println("optionalHello 的值: " + value1);
        System.out.println("optionalEmpty 的值: " + value2);

        // 使用 ifPresent() 方法印出 Optional 中的值
        optionalHello.ifPresent(value -> System.out.println("optionalHello 的內容是: " + value));
        optionalEmpty.ifPresent(value -> System.out.println("optionalEmpty 的內容是: " + value));
    }
}
