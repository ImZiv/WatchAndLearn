package two.part4.advance;

import java.util.ArrayList;
import java.util.List;

/**
 * 動物園容納所有的動物
 */
public class Zoo {
    //這個list放的是animal的物件
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAllAnimals() {
        //逐個物件去判斷並列印
        for (Animal animal : animals) {
            animal.display();
            animal.makeSound();
            animal.eat();
            //檢查這個 animal 物件是不是實作了 Flyable 介面
            if (animal instanceof Flyable) {
                //有的話就讓他飛
                ((Flyable) animal).fly();
            }
            //檢查這個 animal 物件是不是實作了 Swimmable 介面
            if (animal instanceof Swimmable) {
                //有的話就讓他游
                ((Swimmable) animal).swim();
            }

            System.out.println("----------------");
        }
    }
}