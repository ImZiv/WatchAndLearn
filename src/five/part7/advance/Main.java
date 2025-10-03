package five.part7.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 用戶資料處理系統
 */
public class Main {
    public static void main(String[] args) {
        // 模擬一些使用者
        List<User> users = Arrays.asList(
                new User(1L, "alice", "alice@mail.com", 20),
                new User(2L, "bob", null, 25),
                new User(3L, "charlie", "charlie@mail.com", 17)
        );

        // 用 Optional 包裝查詢
        Optional<User> userOpt = findUserById(users, 1L);
        userOpt.ifPresent(u -> System.out.println("找到: " + u));

        // email 驗證
        findUserById(users, 2L)
                .filter(u -> u.getEmail() != null)
                .ifPresentOrElse(
                        u -> System.out.println("Email: " + u.getEmail()),
                        () -> System.out.println("沒有 Email")
                );

        // 名稱轉大寫
        findUserById(users, 1L)
                .map(User::getName)
                .map(String::toUpperCase)
                .ifPresent(name -> System.out.println("大寫名字: " + name));

        // 年齡過濾
        findUserById(users, 3L)
                .filter(u -> u.getAge() > 18)
                .ifPresentOrElse(
                        u -> System.out.println("年齡符合: " + u.getName()),
                        () -> System.out.println("未滿 18 歲")
                );
    }

    // 簡單的查詢方法
    public static Optional<User> findUserById(List<User> users, Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }
}
