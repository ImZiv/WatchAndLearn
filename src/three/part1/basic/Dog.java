package three.part1.basic;

//Dog實作介面
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("汪");
    }
}
