package abstraction.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = String.format("%s.html", title);

            Writer fileWriter = new FileWriter(filename);
            fileWriter.write(this.makeHTML());
            fileWriter.close();

            System.out.println(String.format("%s 을 작성했습니다.", filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String makeHTML();
}
