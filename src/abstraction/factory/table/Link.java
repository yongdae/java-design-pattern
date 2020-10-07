package abstraction.factory.table;

public class Link extends abstraction.factory.Link {
    public Link(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format("<td><a href=\"%s\">%s</a></td>\n", url, cation);
    }
}
