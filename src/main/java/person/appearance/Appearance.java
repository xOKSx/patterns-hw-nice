package person.appearance;

import person.appearance.hair.Hair;

public class Appearance {

    public final String eyes;
    public final Hair hair;

    public Appearance(final String eyes, final Hair hair) {
        this.eyes = eyes;
        this.hair = hair;
    }

    @Override
    public final String toString() {
        return String.format("Глаза:\t\t%1$s%nВолосы:\t\t%2$s", eyes, hair.toString());
    }
}
