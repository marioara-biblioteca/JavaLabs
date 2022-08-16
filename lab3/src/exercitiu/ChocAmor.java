package exercitiu;

public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
        System.out.println("ChocAmor Constructor");
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        System.out.println("ChocAmor Constructor with parameters");
        this.length = length;
    }

    @Override
    public float getVolume() {
        return this.length*this.length*this.length;
    }
    @Override
    public String toString() {
        return "ChocAmor "+ super.toString() + " has volume " + this.getVolume() + "!";
    }
    public void printDim() {
        System.out.println("Dimension of ChocAmor box (L: "+this.length+")");
    }
}
