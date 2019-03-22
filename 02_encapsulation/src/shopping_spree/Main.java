package shopping_spree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");

        for (String p : people) {
            String[] data = p.split("=");
            try {
                Person person = new Person(data[0], Double.parseDouble(data[1]));
                personList.add(person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (String p : products) {
            String[] data = p.split("=");
            try {
                Product product = new Product(data[0], Double.parseDouble(data[1]));
                productList.add(product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String input = scanner.nextLine();
        while (!"END".equals(input)) {

            String[] data = input.split("\\s+");
            String personInput = data[0];
            String productInput = data[1];

            for (Person person : personList) {
                Product productObject = null;

                for (Product product : productList) {
                    if (productInput.equals(product.getName())) {
                        productObject = product;
                    }
                }

                if (person.getName().equals(personInput)) {
                    person.buyProduct(productObject);
                }
            }
            input = scanner.nextLine();
        }

        personList.forEach(p -> System.out.println(p.toString()));
    }
}
