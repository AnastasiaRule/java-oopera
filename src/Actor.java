import java.util.Objects;

public class Actor extends Person { // класс актер дочка класса человек
    private double height; // рост

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0 &&
                java.util.Objects.equals(name, actor.name) &&
                java.util.Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}

