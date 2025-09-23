package four.part2.advance;

import java.util.Collection;

public class CollectionUtils {
    // 將來源集合複製到目標集合
    public static <T> void copyAll(Collection<? super T> dest, Collection<? extends T> src) {
        for (T item : src) {
            dest.add(item);
        }
    }

    // 將多個元素加入到集合
    public static <T> void addAll(Collection<? super T> dest, T... elements) {
        for (T element : elements) {
            dest.add(element);
        }
    }
}
