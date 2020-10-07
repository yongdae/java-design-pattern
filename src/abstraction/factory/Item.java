package abstraction.factory;

public abstract class Item {
    protected String cation;

    public Item(String cation) {
        this.cation = cation;
    }

    public abstract String makeHTML();
}
