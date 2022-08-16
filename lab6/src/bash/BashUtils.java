package bash;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

enum Commands {
    CD("cd"),
    LS("ls"),
    ECHO("echo"),
    HISTORY("history");

    private final String text;

    Commands(final String newText) {
        this.text = newText;
    }

    @Override
    public String toString() {
        return text;
    }
}

public class BashUtils {

    // Implement some inner classes here: Echo, Cd, Ls, History

    // example: class Cd { ... }

    // Decide if they should be static or non-static.

    // TODO 4 Create Echo class
    static class Echo implements CommandSubscriber{
        @Override
        public void executeCommand(Command c) {
            if(c.getCommand().startsWith(Commands.ECHO.toString())){
                System.out.println(c.getCommand().substring(5));
                c.getBash().appendToHistory(c.getCommand());
            }
        }
    }
    static public Echo getEchoCommand(){
        return new Echo();
    }
    // TODO 5 Create Cd class
    static class Cd implements CommandSubscriber{
        @Override
        public void executeCommand(Command c) {
            if(c.getCommand().startsWith(Commands.CD.toString())){
                String path=c.getCommand().substring(3);
                c.getBash().setCurrentDirectory(Paths.get(path));
                c.getBash().appendToHistory(c.getCommand());
            }
        }
    }
    static public Cd getCdCommand(){
        return  new Cd();
    }
    // TODO 6 Create the Ls class
    static class Ls implements CommandSubscriber{
        @Override
        public void executeCommand(Command c) {
            if(c.getCommand().startsWith("ls")){

                File folder=c.getBash().getCurrentDirectory().toFile();
                for(File fileEntry:folder.listFiles()){
                    if(!fileEntry.isDirectory()){
                        System.out.println(fileEntry.getName());
                    }
                }
                c.getBash().appendToHistory(c.getCommand());
            }
        }
    }
    static public Ls getLsCommand(){
        return new Ls();
    }
    // TODO 7 Create the History class
    static class History implements CommandSubscriber{
        @Override
        public void executeCommand(Command c) {
            if(c.getCommand().startsWith(Commands.HISTORY.toString())){
                c.getBash().appendToHistory(c.getCommand());
                System.out.println("History is: "+c.getBash().getHistory());
            }
        }
    }
    static public History getHistoryCommand(){
        return new History();
    }
}
