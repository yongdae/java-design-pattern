package abstraction.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(String.format("클래스 %s 이 발견되지 않았습니다.", classname));
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
