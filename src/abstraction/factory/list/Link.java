package abstraction.factory.list;

public class Link extends abstraction.factory.Link {
    public Link(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format("<li><a href=\"%s\">%s</a></li>\n", url, cation);
    }
}
