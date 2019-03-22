package factories;

import enums.ReportLevel;
import intefaces.Appender;
import intefaces.Factory;
import intefaces.Layout;
import models.ConsoleAppender;
import models.FileAppender;

public class AppenderFactory implements Factory<Appender> {

    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String data) {

        String[] tokens = data.split("\\s+");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = this.layoutFactory.produce(layoutType);
        Appender appender = null;

        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length == 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}
