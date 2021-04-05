package generators;

import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.Hair;
import person.appearance.hair.LongHair;
import person.appearance.hair.NoHair;
import person.appearance.hair.ShortHair;

import java.util.HashMap;

public class AppearanceGenerator extends Generator<Appearance> {

    private String eyes;
    private int hairLength;
    private String hairColor;

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */

    @Override
    protected final void generateParams(final int code) {
        final int i = code % 100 / 10;
        switch (i / 2) {
            case 0:
                eyes = EyesColor.BLUE;
                break;
            case 1:
                eyes = EyesColor.GREEN;
                break;
            case 2:
                eyes = EyesColor.BROWN;
                break;
            case 3:
                eyes = EyesColor.GRAY;
                break;
            case 4:
                eyes = EyesColor.DIFF;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i / 2);
        }
        hairLength = i;

        final HashMap<Integer, String> hairColorMap = new HashMap<>() {{
            put(1, "чёрные");
            put(2, "каштановые");
            put(3, "рыжие");
            put(4, "светлые");
            put(5, "седые");
            put(6, "розовые");
            put(7, "зелёные");
            put(8, "фиолетовые");
            put(9, "синие");
        }};
        if (i > 0) {
            hairColor = hairColorMap.get(i);
        }
    }

    @Override
    protected final Appearance buildResponse() {
        Hair hair;
        if (hairLength > 0) {
            hair = (hairLength > 4) ? new LongHair(hairColor) : new ShortHair(hairColor);
        } else {
            hair = new NoHair();
        }
        return new Appearance(eyes, hair);
    }
}

