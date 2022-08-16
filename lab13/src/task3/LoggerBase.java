package task3;

import java.util.EnumSet;

public abstract class LoggerBase {
    protected EnumSet<LogLevel>logLevels;
    protected LoggerBase next=null;
    public LoggerBase() {
    }
    public void setNext(LoggerBase nextLoggerBase){
        this.next=nextLoggerBase;
    }
    protected abstract void writeMessage(String message);
    public void message(String message, LogLevel severity){
        if(logLevels.contains(severity)) {
            this.writeMessage(message);
        }
        if(next!=null)
            this.next.message(message,severity);


    }
}
