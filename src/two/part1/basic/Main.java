package two.part1.basic;

/**
 * 生活物件分析練習
 */
public class Main {
    /**
     * 學生點餐
     *
     * @param args
     */
    public static void main(String[] args) {
        //叫做「學生」的物件，小明有100元
        Student s = new Student("小明", 100);
        //叫做「食物」的物件，雞排飯價格70元
        Food f = new Food("雞排飯", 70);
        //學生點餐
        s.order(f);
        System.out.println(s.name + " 剩餘金額：" + s.money + " 元");
    }
}
