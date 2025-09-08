package two.part1.basic;

/**
 * 學生類別
 */
public class Student {
    // 學生姓名
    String name;
    // 學生有的零用錢
    int money;

    // 建構子，用來建立學生這個物件
    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 學生點餐的方法，點了食物後扣錢
    public void order(Food food) {
        System.out.println(name + " 點了 " + food.name);
        money -= food.price;
    }
}
