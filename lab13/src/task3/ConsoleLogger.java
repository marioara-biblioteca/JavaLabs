package task3;

import java.util.EnumSet;

public class ConsoleLogger extends LoggerBase{

    public ConsoleLogger() {
        super();
        logLevels=LogLevel.getAll();
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Console] "+message);
    }
}
