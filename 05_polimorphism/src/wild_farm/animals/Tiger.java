package wild_farm.animals;

import wild_farm.food.Food;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String animalLiving) {
        super(animalType, animalName, animalWeight, animalLiving);
        this.livingRegion = animalLiving;
    }


    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            super.eat(food);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
