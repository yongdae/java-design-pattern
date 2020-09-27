package factory.method.idcard;

import factory.method.framework.Product;

public class IDCard implements Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(String.format("%s의 카드를 만듭니다.", owner));
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(String.format("%s의 카드를 사용합니다..", owner));
    }
}
