package interfacePerson;

public class BirthableImpl implements Birthable {

    private String birthdate;

    protected BirthableImpl(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String getBirthDate() {
        return this.birthdate;
    }
}
