package pizza_calories;

public enum BakingTechnique {

    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private final double modifier;

    private BakingTechnique(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
