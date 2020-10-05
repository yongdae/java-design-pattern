package prototype;

public class MessageBox implements Product {

    private char decoration;

    public MessageBox(char decoration) {
        this.decoration = decoration;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoration);
        }

        System.out.println();
        System.out.println(String.format("%s %s %s", decoration, s, decoration));

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoration);
        }

        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
