import java.util.Objects;

public abstract class Invent {
    private final String description;
    private int quantity;
    private final int increment;

    public Invent(String description, int increment) {
        this.description = description;
        this.quantity = 0;
        this.increment = increment;
    }


    abstract void use(Hero hero);

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIncrement() {
        return increment;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return description + "(" + quantity + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invent invent = (Invent) o;
        return Objects.equals(description, invent.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description);
    }

}
