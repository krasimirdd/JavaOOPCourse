package shopping_spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) throws Exception {
        this.products = new ArrayList<>();
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product) {

        if (this.money >= product.getCost()) {
            this.products.add(product);
            try {
                this.setMoney(this.money - product.getCost());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", this.name, product.getName());
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws Exception {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new Exception("Name cannot be empty");
        }

        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) throws Exception {
        if (money < 0) {
            throw new Exception("Money cannot be negative");
        }

        this.money = money;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.name)
                .append(" - ");

        if (this.products.isEmpty()) {
            sb.append("Nothing bought");
            return sb.toString();
        }

        products.forEach(e -> sb.append(e.getName()).append(", "));
        return sb.subSequence(0, sb.length() - 2).toString();
    }
}
