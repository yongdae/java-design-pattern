package template.method;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello");

        display1.display();
        display2.display();
    }
}
