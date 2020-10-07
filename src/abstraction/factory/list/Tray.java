package abstraction.factory.list;

import abstraction.factory.Item;

import java.util.Iterator;

public class Tray extends abstraction.factory.Tray {
    public Tray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(String.format("%s\n", cation));
        buffer.append("<ul>\n");

        Iterator iterator = tray.iterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}
