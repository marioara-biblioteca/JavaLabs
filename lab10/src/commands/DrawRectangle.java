package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand{
    private DiagramCanvas diagramCanvas;
    private int height;
    private  int weight;
    private String text;
    private String color;

    public DrawRectangle(DiagramCanvas diagramCanvas, int height, int weight, String text, String color) {
        this.diagramCanvas = diagramCanvas;
        this.height = height;
        this.weight = weight;
        this.text = text;
        this.color = color;
    }

    @Override
    public void execute() {
        DiagramComponent rectangle=new DiagramComponent();
        rectangle.setText(text);
        rectangle.setHeight(height);
        rectangle.setWeight(weight);
        rectangle.setColor(color);
        diagramCanvas.addComponent(rectangle);
    }

    @Override
    public void undo() {

    }
}
