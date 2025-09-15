package two.part5.basic;

/**
 * 動物抽象類別系統
 */
//抽象類別 Animal
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // 抽象方法：子類別必須實作
    public abstract void makeSound();
}
