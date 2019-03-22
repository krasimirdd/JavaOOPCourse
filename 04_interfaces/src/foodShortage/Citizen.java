package foodShortage;

public class Citizen extends BasePerson implements Identifiable {

    private String id;
    private String birthdate;
    private int food;

    public Citizen(String name, int age, String id, String birhtdate) {
        super(name, age);
        this.id = id;
        this.birthdate = birhtdate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
