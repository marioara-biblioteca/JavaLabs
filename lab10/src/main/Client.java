package main;

import commands.*;
import  diagram.*;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {
    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO
        this.diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
        this.diagramCanvas=new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }
        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException
        if(type.equals(CommandType.CHANGE_COLOR)) //id    color
            return new ChangeColor(diagramCanvas,args[0],args[1]);
        if(type.equals(CommandType.CHANGE_TEXT)) //id     text
            return new ChangeText(diagramCanvas,args[0],args[1]);
        if(type.equals(CommandType.DRAW_RECTANGLE))//    height                  width                  text     color
            return new DrawRectangle(diagramCanvas,Integer.parseInt( args[0]),Integer.parseInt(args[1]),args[2],args[3]);
        if(type.equals(CommandType.RESIZE))  //id         width                 height
            return new Resize(diagramCanvas,args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        throw new IllegalArgumentException();
    }

    public void undo(){
        // TODO
        invoker.undo();
    }

    public void redo() {
        // TODO
        invoker.redo();
    }
}
