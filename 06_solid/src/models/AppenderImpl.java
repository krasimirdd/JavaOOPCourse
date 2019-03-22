package models;

import enums.ReportLevel;
import intefaces.Appender;
import intefaces.Layout;

public abstract class AppenderImpl implements Appender {

    public static final ReportLevel REPORT_LEVEL_DEFAULT = ReportLevel.INFO;

    private Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;

    public AppenderImpl(Layout layout) {
        this.layout = layout;
        this.reportLevel = REPORT_LEVEL_DEFAULT;
        this.messagesCount = 0;
    }

    public AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this(layout);
        this.reportLevel = reportLevel;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public abstract void append(String time, String message, ReportLevel reportLevel);

    public Layout getLayout() {
        return this.layout;
    }

    protected boolean canAppend(ReportLevel reportLevel) {
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    protected void incrementMessagesCount() {
        ++this.messagesCount;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel.toString(),
                this.messagesCount
        );
    }
}
