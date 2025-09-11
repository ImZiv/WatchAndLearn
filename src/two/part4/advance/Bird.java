package two.part4.advance;

/**
 * 鳥類繼承動物，實作飛翔
 */
public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 啾啾叫 ");
    }

    @Override
    public void fly() {
        System.out.println(name + " 飛在空中");
    }
}

