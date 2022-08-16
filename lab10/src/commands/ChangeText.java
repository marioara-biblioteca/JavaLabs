package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ChangeText implements DrawCommand{
    private DiagramCanvas diagramCanvas;
    private String componentId;
    private String lastText;
    private String newText;

    public ChangeText(DiagramCanvas diagramCanvas, String componentId, String newText) {
        this.diagramCanvas = diagramCanvas;
        this.componentId = componentId;
        this.newText = newText;
    }

    @Override
    public void execute() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null){
            lastText=component.getText();
            component.setText(newText);
            System.out.println("Changed text for component");
        }
    }

    @Override
    public void undo() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null){
            newText=lastText;
            lastText=component.getText();
            component.setText(newText);
            System.out.println("Undid change text");
        }
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "diagramCanvas=" + diagramCanvas +
                ", componentId='" + componentId + '\'' +
                ",with lastText='" + lastText + '\'' +
                ",new newText='" + newText + '\'' +
                '}';
    }
}
