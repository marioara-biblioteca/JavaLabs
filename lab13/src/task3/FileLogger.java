package task3;

import java.util.EnumSet;

public class FileLogger extends LoggerBase{
    public FileLogger() {
        super();
        logLevels=EnumSet.of(LogLevel.Error,LogLevel.Warning);
    }
    @Override
    protected void writeMessage(String message) {
        System.out.println("[File] "+message);
    }
}
