package two.part4.advance;

/**
 * 魚類繼承動物，實作游泳
 */
public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 波波叫");
    }

    @Override
    public void swim() {
        System.out.println(name + " 水裡游");
    }
}

