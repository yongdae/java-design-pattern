package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();

        System.out.println(String.format("one과 two는 %s 인스턴스입니다.", one == two ? "같은" : "다른"));
    }
}
