package task3;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase{
    public EmailLogger() {
        super();
        logLevels=EnumSet.of(LogLevel.FunctionalMessage,LogLevel.FunctionalError);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Email] "+message);
    }
}
