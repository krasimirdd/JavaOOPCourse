package models;

import enums.ReportLevel;
import intefaces.Appender;
import intefaces.Logger;

public class MessageLogger implements Logger {

    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    private void logAll(String time, String message, ReportLevel reportLevel) {
        for (Appender appender : appenders) {
            appender.append(time, message, reportLevel);
        }
    }

    @Override
    public void log(String time, String message, ReportLevel reportLevel) {
        this.logAll(time, message, reportLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Logger info");
        sb.append(System.lineSeparator());

        for (Appender appender : this.appenders) {
            sb.append(System.lineSeparator())
                    .append(appender.toString());
        }

        return sb.toString();
    }
}
