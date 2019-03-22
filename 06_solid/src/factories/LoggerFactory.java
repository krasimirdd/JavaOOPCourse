package factories;

import intefaces.Appender;
import intefaces.Factory;
import intefaces.Logger;
import models.MessageLogger;

public class LoggerFactory implements Factory<Logger> {

    private AppenderFactory appenderFactory;

    public LoggerFactory() {
        this.appenderFactory = new AppenderFactory();
    }

    @Override
    public Logger produce(String data) {

        String[] input = data.split(System.lineSeparator());

        Appender[] appenders = new Appender[input.length];
        for (int i = 0; i < appenders.length; ++i) {
            appenders[i] = this.appenderFactory.produce(input[i]);
        }
        return new MessageLogger(appenders);
    }
}
