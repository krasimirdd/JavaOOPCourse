package interfacePerson;

public class Pet extends BirthableImpl implements Birthable {
    private String name;

    public Pet(String birthdate, String name) {
        super(birthdate);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
