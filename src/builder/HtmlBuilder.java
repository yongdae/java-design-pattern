package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder implements Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = String.format("%s.html", title);

        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println(String.format("<html><head><title>%s</title></head><body>", title));
        writer.println(String.format("<h1>%s</h1>", title));
    }

    @Override
    public void makeString(String string) {
        writer.println(String.format("<p>%s</p>", string));
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println(String.format("<li>%s</li>", item));
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
