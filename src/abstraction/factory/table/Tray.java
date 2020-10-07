package abstraction.factory.table;

import abstraction.factory.Item;

import java.util.Iterator;

public class Tray extends abstraction.factory.Tray {
    public Tray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table>\n");
        buffer.append("<tr>\n");
        buffer.append("<td>\n");
        buffer.append(String.format("%s\n", cation));
        buffer.append("</td>\n");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator iterator = tray.iterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</tr>\n");
        buffer.append("</table>\n");
        buffer.append("</td>\n");

        return buffer.toString();
    }
}
