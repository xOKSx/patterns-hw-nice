package person;

public class Fio {

    public String firstName;
    public String middleName;
    public String lastName;

    public Fio(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    @Override
    public final String toString() {
        return String.format("%1$s %2$s %3$s", this.lastName, this.firstName, this.middleName);
    }

}
