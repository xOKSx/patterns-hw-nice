package person;

import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.appearance.Appearance;

public class PersonBuilder {

    private final String id;
    private Fio fio;
    private Physical physical;
    private Appearance appearance;
    private Phone phone;

    public PersonBuilder(final String id) {
        this.id = id;
    }

    public final PersonBuilder addFio(final int intCode) {
        this.fio = new FioGenerator().generate(intCode);
        return this;
    }

    public final PersonBuilder addPhysical(final int intCode) {
        this.physical = new PhysGenerator().generate(intCode);
        return this;
    }

    public final PersonBuilder addAppearance(final int intCode) {
        this.appearance = new AppearanceGenerator().generate(intCode);
        return this;
    }

    public final PersonBuilder addPhone(final int intCode) {
        this.phone = new PhoneGenerator().generate(intCode);
        return this;
    }

    public final Person buildPerson() {
        Person person = new Person();
        person.setId(this.id);
        person.setFio(this.fio);
        person.setPhysical(this.physical);
        person.setAppearance(this.appearance);
        person.setPhone(this.phone);
        return person;
    }
}
