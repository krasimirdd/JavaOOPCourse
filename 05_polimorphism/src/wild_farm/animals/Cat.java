package wild_farm.animals;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String animalLiving, String breed) {
        super(animalType, animalName, animalWeight, animalLiving);
        this.breed = breed;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                this.breed,
                format.format(getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten()
        );
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
}
