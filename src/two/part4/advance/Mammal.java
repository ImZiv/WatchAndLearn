package two.part4.advance;

/**
 * 哺乳動物繼承動物
 */
public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 發出哺乳動物的聲音");
    }
}

