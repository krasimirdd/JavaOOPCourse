package pizza_calories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) throws Exception {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) throws Exception {
        for (ToppingType value : ToppingType.values()) {
            if (toppingType.equals(value.toString())) {
                this.toppingType = toppingType;
                return;
            }
        }

        throw new Exception(String.format("Cannot place %s on top of your pizza.", toppingType));
    }

    private void setWeight(double weight) throws Exception {
        if (weight < 1 || weight > 50) {
            throw new Exception(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }

        this.weight = weight;
    }

    public double calculateCalories() {

        double calories = 2 * weight;

        switch (this.toppingType) {
            case "Meat":
                calories *= ToppingType.Meat.getModifier();
                break;
            case "Veggies":
                calories *= ToppingType.Veggies.getModifier();
                break;
            case "Cheese":
                calories *= ToppingType.Cheese.getModifier();
                break;
            case "Sauce":
                calories *= ToppingType.Sauce.getModifier();
                break;
        }
        return calories;
    }
}

