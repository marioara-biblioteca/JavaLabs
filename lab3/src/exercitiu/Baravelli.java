package exercitiu;
import java.lang.Math;
public class Baravelli extends CandyBox{
    private float radius;
    private float height;

    public Baravelli() {
       System.out.println("Bravelli Constructor");
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        System.out.println("Bravelli Constructor with parameters");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return ((float) Math.PI)*this.height*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Baravelli "+ super.toString() + " has volume " + this.getVolume() + "!";
    }
    @Override
    public void printDim() {
        System.out.println("Dimension of Baravelli box (H: "+this.height+", R: "+this.radius+")");
    }
}
