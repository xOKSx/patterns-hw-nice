package person;

import person.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public final String getId() {
        return this.id;
    }

    public final Fio getFio() {
        return this.fio;
    }

    public final Physical getPhysical() {
        return this.phys;
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    public final void setFio(final Fio fio) {
        this.fio = fio;
    }

    public final void setPhysical(final Physical physical) {
        this.phys = physical;
    }

    public final void setAppearance(final Appearance appearance) {
        this.appearance = appearance;
    }

    public final void setPhone(final Phone phone) {
        this.phone = phone;
    }

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}