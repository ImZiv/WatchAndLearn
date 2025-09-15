package two.part5.basic;

// Cat 繼承 Animal
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "喵");
    }
}
