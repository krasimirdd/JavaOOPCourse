package pizza_calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppingsCount) throws Exception {
        setName(name);
        setToppings(toppingsCount);
    }

    private void setName(String name) throws Exception {
        if (name.length() > 15 || name.length() < 1) {
            throw new Exception("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    private void setToppings(int toppingsCount) throws Exception {
        if (toppingsCount > 10 || toppingsCount < 0) {
            throw new Exception("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(toppingsCount);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {

        double totalCalories = 0;

        totalCalories += dough.calculateCalories();
        for (Topping topping : toppings) {
            totalCalories += topping.calculateCalories();
        }

        return totalCalories;
    }

}
