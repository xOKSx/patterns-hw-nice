package person;

public class PersonFactory {

    public static Person generatePerson(final String input) {
        final int intCode = Integer.parseInt(input);
        PersonBuilder builder = new PersonBuilder(input)
                .addFio(intCode)
                .addAppearance(intCode)
                .addPhysical(intCode);
        if (!input.equals(new StringBuilder(input).reverse().toString())) {
            builder.addPhone(intCode);
        }
        return builder.buildPerson();
    }
}
