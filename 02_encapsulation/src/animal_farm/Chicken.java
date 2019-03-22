package animal_farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) throws Exception {
        setName(name);
        setAge(age);
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Name cannot be empty.");
        }

        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age > 15 || age < 0) {
            throw new Exception("Age should be between 0 and 15.");
        }

        this.age = age;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.age < 6) {
            return 2;
        } else if (this.age < 12) {
            return 1;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {

        return String.format("Chicken %s (age %d) can produce %.0f eggs per day.", this.name, this.age, productPerDay());
    }
}
