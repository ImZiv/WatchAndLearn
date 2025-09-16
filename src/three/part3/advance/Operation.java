package three.part3.advance;

@FunctionalInterface
public interface Operation {
    int apply(int a, int b);

    // 預設方法：描述操作類型
    default String describe() {
        return "未定義的運算";
    }
}
