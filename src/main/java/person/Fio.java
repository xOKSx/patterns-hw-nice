package person;

public class Fio {

    private final String firstName;
    private final String middleName;
    private final String lastName;

    public Fio(final String firstName, final String middleName, final String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    @Override
    public final String toString() {
        return String.format("%1$s %2$s %3$s", this.lastName, this.firstName, this.middleName);
    }

}
