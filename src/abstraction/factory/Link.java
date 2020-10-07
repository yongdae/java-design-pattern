package abstraction.factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String cation, String url) {
        super(cation);
        this.url = url;
    }
}
