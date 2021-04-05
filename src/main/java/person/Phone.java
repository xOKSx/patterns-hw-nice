package person;

public class Phone {

    private final String number;

    public Phone(final String number) {
        this.number = number;
    }

    public final String getNumber() {
        return this.number;
    }

    @Override
    public final String toString() {
        return "Телефон:\t" + number;
    }
}
