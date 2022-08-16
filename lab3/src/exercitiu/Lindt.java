package exercitiu;

import java.util.Objects;

public class Lindt extends CandyBox{
    private float length;
    private float width;
    private float height;
    public Lindt() {
        System.out.println("Lindt Constructor");
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        System.out.println("Lindt Constructor with parameters");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return this.height*this.length*this.width;
    }
    @Override
    public String toString() {
        return "Lindt "+ super.toString() + " has volume " + this.getVolume() + "!";
    }

    @Override
    public void printDim() {
        System.out.println("Dimension of Lindt box (W: "+this.width+", H: "+this.height+", L: "+this.length+")");
    }
}
