package prototype;

public class UnderlinePen implements Product {

    private char symbol;

    public UnderlinePen(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(String.format("\"%s\"", s));

        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
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
