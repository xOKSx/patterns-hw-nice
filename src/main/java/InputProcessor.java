import person.PersonFactory;

public class InputProcessor {

    public final String processInput(final String input) {
        if (input.trim().matches("\\d{4}")) {
            return PersonFactory.generatePerson(input).toString();
        } else {
            return "Неверный ввод.";
        }
    }
}
