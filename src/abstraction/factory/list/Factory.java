package abstraction.factory.list;

public class Factory extends abstraction.factory.Factory {
    @Override
    public abstraction.factory.Link createLink(String caption, String url) {
        return new Link(caption, url);
    }

    @Override
    public abstraction.factory.Tray createTray(String caption) {
        return new Tray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new Page(title, author);
    }
}
