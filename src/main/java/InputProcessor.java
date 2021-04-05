import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.*;
import person.appearance.Appearance;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            final int intCode = Integer.parseInt(input);
            PersonBuilder builder = new PersonBuilder(input)
                    .addFio(intCode)
                    .addAppearance(intCode)
                    .addPhysical(intCode);
            // добавляем телефон, только если введённый код не палиндром
            if (!input.equals(new StringBuilder(input).reverse().toString())) {
                builder.addPhone(intCode);
            }
            result = builder.buildPerson().toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}
