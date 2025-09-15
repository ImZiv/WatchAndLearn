package two.part5.basic;

// Dog 繼承 Animal
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "汪");
    }
}
