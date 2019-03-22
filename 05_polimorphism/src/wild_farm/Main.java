package wild_farm;

import wild_farm.animals.*;
import wild_farm.food.Food;
import wild_farm.food.Meat;
import wild_farm.food.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        List<Food> foods = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        Food food = null;
        Animal animal = null;

        for (int i = 1; !data[0].equals("End"); i++) {

            switch (data[0]) {
                case "Cat":
                    animal =
                            new Cat(data[0], data[1], Double.parseDouble(data[2]), data[3], data[4]);
                    break;
                case "Tiger":
                    animal =
                            new Tiger(data[0], data[1], Double.parseDouble(data[2]), data[3]);
                    break;
                case "Zebra":
                    animal =
                            new Zebra(data[0], data[1], Double.parseDouble(data[2]), data[3]);
                    break;
                case "Mouse":
                    animal =
                            new Mouse(data[0], data[1], Double.parseDouble(data[2]), data[3]);
                    break;

                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(data[1]));
                    break;

                case "Meat":
                    food = new Meat(Integer.parseInt(data[1]));
                    break;
            }

            if (i % 2 == 0) {
                animals.add(animal);
                foods.add(food);
            }
            data = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
            animals.get(i).eat(foods.get(i));
        }
        for (Animal currAnimal : animals) {
            System.out.println(currAnimal);
        }
    }
}
