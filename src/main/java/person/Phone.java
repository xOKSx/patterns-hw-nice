package person;

public class Phone {

    public String number;

    public Phone(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        return "Телефон:\t" + number;
    }
}
