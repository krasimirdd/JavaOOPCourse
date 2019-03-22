package models;

import enums.ReportLevel;
import intefaces.Layout;

public class XmlLayout implements Layout {
    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("<log>%n" +
                        "\t<date>%s</date>%n" +
                        "\t<level>%s</level>%n" +
                        "\t<message>%s</message>%n" +
                        "</log>%n",
                time, reportLevel, message);
    }
}
