package interfacePerson;

public class Citizen extends BirthableImpl implements Person, Identifiable {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id, String birthdate) {
        super(birthdate);
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
