package foodShortage;

public class Rebel extends BasePerson {

    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
        this.food = 0;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
