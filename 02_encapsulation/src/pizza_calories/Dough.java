package pizza_calories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) throws Exception {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) throws Exception {
        for (FlourType value : FlourType.values()) {
            if (flourType.equals(value.toString())) {
                this.flourType = flourType;
                return;
            }
        }

        throw new Exception("Invalid type of dough.");
    }

    private void setBakingTechnique(String bakingTechnique) throws Exception {
        for (BakingTechnique value : BakingTechnique.values()) {
            if (bakingTechnique.equals(value.toString())) {
                this.bakingTechnique = bakingTechnique;
                return;
            }
        }

        throw new Exception("Invalid type of dough.");
    }

    private void setWeight(double weight) throws Exception {
        if (weight < 1 || weight > 200) {
            throw new Exception("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {

        double calories = 2 * this.weight;

        switch (this.flourType) {
            case "White":
                calories *= FlourType.White.getModifier();
                break;
            case "Wholegrain":
                calories *= FlourType.Wholegrain.getModifier();
                break;
        }
        switch (this.bakingTechnique) {
            case "Crispy":
                calories *= BakingTechnique.Crispy.getModifier();
                break;
            case "Chewy":
                calories *= BakingTechnique.Chewy.getModifier();
                break;
            case "Homemade":
                calories *= BakingTechnique.Homemade.getModifier();
                break;
        }
        return calories;
    }
}
