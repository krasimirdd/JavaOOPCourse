package wild_farm.animals;

import wild_farm.food.Food;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, String animalLiving) {
        super(animalType, animalName, animalWeight, animalLiving);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            super.eat(food);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
