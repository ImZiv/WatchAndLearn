package two.part4.advance;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal bird = new Bird("麻雀", 2);
        Animal fish = new Fish("金魚", 1);
        Animal mammal = new Mammal("猴子", 5);

        zoo.addAnimal(bird);
        zoo.addAnimal(fish);
        zoo.addAnimal(mammal);

        zoo.showAllAnimals();
    }
}
