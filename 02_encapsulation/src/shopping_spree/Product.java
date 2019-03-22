package shopping_spree;

public class Product {
    private String name;
    private double cost;


    public Product(String name, double cost) throws Exception {
        setCost(cost);
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {

        if (name.isEmpty() || name.trim().length() == 0) {
            throw new Exception("Name cannot be empty");
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) throws Exception {
        if (cost < 0) {
            throw new Exception("Money cannot be negative");
        }
        this.cost = cost;
    }
}
