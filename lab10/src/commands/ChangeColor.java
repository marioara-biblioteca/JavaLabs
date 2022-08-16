package commands;

import diagram.*;
//Comenzile primesc în constructor referința către DiagramCanvas și alte argumente necesare lor. De exemplu, comanda pentru schimbarea culorii trebuie sa primească și culoarea nouă și indexul componentei.
public class ChangeColor implements DrawCommand{
    private DiagramCanvas diagramCanvas;
    private String componentId;
    private String newColor;
    private String lastColor;

    public ChangeColor(DiagramCanvas diagramCanvas, String componentId, String newColor) {
        this.diagramCanvas = diagramCanvas;
        this.componentId = componentId;
        this.newColor = newColor;
    }

    @Override
    public void execute() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null){
            lastColor=component.getColor();
            component.setColor(newColor);
            System.out.println("Executed color change");
        }
    }

    @Override
    public void undo() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null) {
            newColor = lastColor;
            lastColor = component.getColor();
            component.setColor(newColor);
            System.out.println("Undid color change");
        }

    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "diagramCanvas=" + diagramCanvas +
                ",for componentId='" + componentId + '\'' +
                ",with newColor='" + newColor + '\'' +
                ",old lastColor='" + lastColor + '\'' +
                '}';
    }
}
