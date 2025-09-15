package two.part5.basic;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("狗");
        Animal cat = new Cat("貓");
        //多型
        dog.makeSound();
        cat.makeSound();
    }
}
