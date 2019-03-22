package pizza_calories;

public enum FlourType {
    White(1.5),
    Wholegrain(1.0);

    private final double modifier;

    private FlourType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
