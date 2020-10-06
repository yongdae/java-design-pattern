package builder;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("============================\n");
        buffer.append(String.format("|%s|", title));
        buffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        buffer.append(String.format("-%s", string));
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append(String.format(" .%s\n", item));
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
