package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructor() {
        builder.makeTitle("Greeting");
        builder.makeString("Good Morning or Good Night");
        builder.makeItems(new String[]{"Good Morning", "Good Night"});

        builder.close();
    }
}
