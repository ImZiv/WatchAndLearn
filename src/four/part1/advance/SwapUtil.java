package four.part1.advance;

//之後會遇到這樣，寫個工具類，但是你不知道對方會傳什麼值，所以這樣寫
public class SwapUtil {
    // 使用泛型交換陣列中兩個元素
    public static <T> void swap(T[] array, int i, int j) {
        //先把第一個傳入的值放到一個暫存的變數
        T temp = array[i];
        //然後把第二個值覆蓋掉第一個值
        array[i] = array[j];
        //再把放入暫存變數中的值覆蓋掉第二個值的位置，就完成交換了
        array[j] = temp;
    }
}
