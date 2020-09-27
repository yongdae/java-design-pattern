package factory.method;

import factory.method.framework.Factory;
import factory.method.framework.Product;
import factory.method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("yongdae");
        Product card2 = factory.create("guest1");
        Product card3 = factory.create("guest2");

        card1.use();
        card2.use();
        card3.use();
    }
}
