package task3;

import java.util.EnumSet;

public enum LogLevel {
    Info("Info"),
    Debug("Debug"),
    Warning("Warning"),
    Error("Error"),
    FunctionalMessage("FunctionalMessage"),
    FunctionalError("FunctionalError");
    public final String text;
    LogLevel(String text){
        this.text=text;
    }
    public static EnumSet<LogLevel> getAll(){
        return EnumSet.allOf(LogLevel.class);
    }
}
