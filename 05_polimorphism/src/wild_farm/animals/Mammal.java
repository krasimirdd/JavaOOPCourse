package wild_farm.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String animalLiving) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = animalLiving;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.#`#");

        return String.format("%s[%s, %s, %s, %s]",
                super.getAnimalType(),
                super.getAnimalName(),
                format.format(super.getAnimalWeight()),
                this.livingRegion,
                super.getFoodEaten()
        );
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
