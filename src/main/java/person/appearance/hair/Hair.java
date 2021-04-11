package person.appearance.hair;

public class Hair {

    private HairLength hairLength;
    private String hairColour;

    public Hair(final HairLength hairLength, final String hairColour) {
        this.hairLength = hairLength;
        this.hairColour = hairColour;
    }

    @Override
    public final String toString() {
        if (hairLength instanceof NoHair) {
            return hairLength.toString();
        } else {
            return hairLength.toString() + ", " + hairColour;
        }
    }
}
