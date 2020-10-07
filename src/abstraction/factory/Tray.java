package abstraction.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String cation) {
        super(cation);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
