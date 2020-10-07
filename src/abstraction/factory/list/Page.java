package abstraction.factory.list;

import abstraction.factory.Item;

import java.util.Iterator;

public class Page extends abstraction.factory.Page {
    public Page(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(String.format("<html><head><title>%s</title></head>\n", title));
        buffer.append("<body>\n");
        buffer.append(String.format("<h1>%s</h1>\n", title));
        buffer.append("<ul>\n");

        Iterator iterator = content.iterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append(String.format("<hr><address>%s</address>", author));
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
