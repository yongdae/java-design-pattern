package prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox warringMessage = new MessageBox('*');
        MessageBox slashMessage = new MessageBox('/');

        manager.register("underline", underlinePen);
        manager.register("warring box", warringMessage);
        manager.register("slash box", slashMessage);

        String message = "Hello, world.";

        manager.create("underline").use(message);
        manager.create("warring box").use(message);
        manager.create("slash box").use(message);
    }
}
