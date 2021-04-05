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

    public PersonBuilder(String id) {
        this.id = id;
    }

    public PersonBuilder addFio(int intCode) {
        this.fio = new FioGenerator().generate(intCode);
        return this;
    }

    public PersonBuilder addPhysical(int intCode) {
        this.physical = new PhysGenerator().generate(intCode);
        return this;
    }

    public PersonBuilder addAppearance(int intCode) {
        this.appearance = new AppearanceGenerator().generate(intCode);
        return this;
    }

    public PersonBuilder addPhone(int intCode) {
        this.phone = new PhoneGenerator().generate(intCode);
        return this;
    }

    public Person buildPerson() {
        Person person = new Person();
        person.id = this.id;
        person.fio = this.fio;
        person.phys = this.physical;
        person.appearance = this.appearance;
        person.phone = this.phone;
        return person;
    }
}
