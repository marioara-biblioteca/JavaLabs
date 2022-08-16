package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ConnectComponents implements DrawCommand{
    private DiagramCanvas diagramCanvas;

    private String mainComponentId;
    private String addedComponentId;

    public ConnectComponents(DiagramCanvas diagramCanvas, String mainComponentId, String addedComponentId) {
        this.diagramCanvas = diagramCanvas;
        this.mainComponentId = mainComponentId;
        this.addedComponentId = addedComponentId;
    }

    @Override
    public void execute() {
        DiagramComponent mainComponent=diagramCanvas.getComponent(Integer.parseInt(mainComponentId));
        DiagramComponent addedComponent=diagramCanvas.getComponent(Integer.parseInt(addedComponentId));
        if(mainComponent!=null && addedComponent!=null)
        {
            mainComponent.connectTo(addedComponentId);
        }
    }

    @Override
    public void undo() {
        DiagramComponent mainComponent=diagramCanvas.getComponent(Integer.parseInt(mainComponentId));
        DiagramComponent addedComponent=diagramCanvas.getComponent(Integer.parseInt(addedComponentId));
        if(mainComponent!=null && addedComponent!=null)
        {
            mainComponent.removeConnection(addedComponentId);
        }
    }
}
