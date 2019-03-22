package foodShortage;

public abstract class BasePerson implements Buyer {
    private String name;
    private int age;

    public BasePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void buyFood();

    public abstract int getFood();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAge() {
        return String.valueOf(this.age);
    }
}
