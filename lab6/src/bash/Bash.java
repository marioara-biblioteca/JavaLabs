package bash;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public final class Bash {
    private Path currentDirectory;
    private StringBuffer history;

    private CommandPublisher publisher;
    private static final String EXIT = "exit";

    public Bash() {
        // TODO 2 Initialize history and currentDirectory;
         history = new StringBuffer();
         currentDirectory = Paths.get(".");
        // TODO 2 Instantiate a new command publisher
         publisher = new BashCommandPublisher();

        // TODO 4 & 5 & 6 & 7
        BashUtils utils=new BashUtils();
        // CommandSubscribers know how to execute the commands.
        // Subscribe some to the Command publisher.
        publisher.subscribe(utils.getLsCommand());
        publisher.subscribe(utils.getEchoCommand());
        publisher.subscribe(utils.getCdCommand());
        publisher.subscribe(utils.getHistoryCommand());

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TODO 3 Read commands from the command line
             String input = scanner.nextLine();

            // TODO 3 If we read the "exit" string then we should stop the program.
            if(input==EXIT){
                break;
            }
            // TODO 3 Create an anonymous class which extends Thread.
            // It has to implement the 'run' method. From the 'run' method publish the command
            // so that the CommandSubscribers start executing it.
            // Don't forget to start the thread by calling the 'start' method on it!
            Thread t=new Thread(){
                public void run(){
                    publisher.publish(new Command(input,Bash.this));
                }
            };
            t.start();
        }
    }

    public Path getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(Path currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public StringBuffer getHistory() {
        return history;
    }
    public void appendToHistory(String s){
        this.history.append(s);
    }

    // TODO 1: Create an inner class which implements the CommandPublisher interface.
    // 1. The class should contain an ArrayList of CommandSubscribers
    // 2. The class should implement the subscribe and publish methods.
    class BashCommandPublisher implements CommandPublisher{
        private ArrayList<CommandSubscriber>commandSubscribers=new ArrayList<CommandSubscriber>();
        @Override
        public void subscribe(CommandSubscriber subscriber) {
            //adaugam un subscriber in lista de subscriberi
            if(!commandSubscribers.contains(subscriber))
                commandSubscribers.add(subscriber);

        }

        @Override
        public void publish(Command command) {
            for(CommandSubscriber s:commandSubscribers){
                s.executeCommand(command);
            }
        }
    }

}
