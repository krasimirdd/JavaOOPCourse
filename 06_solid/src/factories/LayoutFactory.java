package factories;

import intefaces.Factory;
import intefaces.Layout;
import models.SimpleLayout;
import models.XmlLayout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String data) {

        Layout layout = null;
        if (data.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (data.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return layout;
    }
}
