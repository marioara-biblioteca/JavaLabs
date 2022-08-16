package task3;

import java.util.Arrays;

public class Polygon {
    private Integer noCorners;
    private Point[] points;

    public Polygon(Integer noCorners){
        this.noCorners=noCorners;
        this.points=new Point[noCorners];
    }
    public Polygon(Float[]coords){
        this(coords.length/2);
        for(int i=0;i<noCorners;i++){
            this.points[i]=new Point(coords[i],coords[i+1]);
        }
    }

    @Override
    public String toString() {
        String res="Nr of corners: "+String.valueOf(noCorners)+"\n";
        for(int i=0;i<noCorners;i++)
            res+=points[i].toString();
        return res;
    }
}
