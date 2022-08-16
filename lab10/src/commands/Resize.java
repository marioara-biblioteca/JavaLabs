package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class Resize implements DrawCommand{
    private DiagramCanvas diagramCanvas;
    private String componentId;
    private int newHeight;
    private int lastHeight;
    private int newWeight;
    private int lastWeight;

    public Resize(DiagramCanvas diagramCanvas, String componentId, int newHeight, int newWeight) {
        this.diagramCanvas = diagramCanvas;
        this.componentId = componentId;
        this.newHeight = newHeight;
        this.newWeight = newWeight;
    }

    @Override
    public void execute() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null){
            lastWeight=component.getWeight();
            lastHeight=component.getHeight();
            component.setWeight(newWeight);
            component.setHeight(newHeight);
            System.out.println("Resized component");
        }
    }

    @Override
    public void undo() {
        DiagramComponent component=diagramCanvas.getComponent(Integer.parseInt(componentId));
        if(component!=null) {
            newHeight = lastHeight;
            newWeight = lastWeight;
            lastHeight =component.getHeight();
            lastWeight=component.getWeight();
            component.setHeight(newHeight);
            component.setWeight(newWeight);
            System.out.println("Resized component");
        }
    }

    @Override
    public String toString() {
        return "Resize{" +
                "diagramCanvas=" + diagramCanvas +
                ", componentId='" + componentId + '\'' +
                ", newHeight=" + newHeight +
                ", lastHeight=" + lastHeight +
                ", newWeight=" + newWeight +
                ", lastWeight=" + lastWeight +
                '}';
    }
}
