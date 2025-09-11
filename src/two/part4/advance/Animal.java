package two.part4.advance;

/**
 * 動物我們用抽象類別來繼承
 */
public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法：每個動物都要能發出聲音
    public abstract void makeSound();

    // 每個動物都會吃飯
    public void eat() {
        System.out.println(name + " 正在吃");
    }

    //顯示是什麼動物
    public void display() {
        System.out.println("動物: " + name + ", 年紀: " + age);
    }
}
