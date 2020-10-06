package builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.constructor();
            System.out.println(textBuilder.getResult());
        }

        if (args[0].equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.constructor();
            System.out.println(String.format("%s 가 작성되었습니다.", htmlBuilder.getResult()));
        }
    }

    private static void usage() {
        System.out.println("Usage: plain");
        System.out.println("Usage: html");
    }
}
