package pizza_calories;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] pizzaData = scanner.nextLine().split("\\s+");
            Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));

            String[] doughData = scanner.nextLine().split("\\s+");
            Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));

            String toppingData = scanner.nextLine();
            while (!"END".equals(toppingData)) {

                String[] data = toppingData.split("\\s+");
                Topping topping = new Topping(data[1], Double.parseDouble(data[2]));

                pizza.addTopping(topping);
                pizza.setDough(dough);

                toppingData = scanner.nextLine();
            }

            System.out.println(pizza.getOverallCalories());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

