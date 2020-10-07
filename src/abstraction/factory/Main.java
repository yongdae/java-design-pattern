package abstraction.factory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java main class.name.of.ConcreteFactory");
            System.out.println("Example1: abstraction.factory.list.Factory");
            System.out.println("Example2: abstraction.factory.table.Factory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link google = factory.createLink("Google", "http://www.google.com");
        Link naver = factory.createLink("Naver", "http://www.naver.com");

        Tray trayNews = factory.createTray("Search Engine");
        trayNews.add(google);
        trayNews.add(naver);

        Page page = factory.createPage("LinkPage", "Your");
        page.add(trayNews);

        page.output();
    }
}
