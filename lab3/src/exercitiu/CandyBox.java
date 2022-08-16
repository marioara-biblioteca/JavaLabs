package exercitiu;

import java.security.PublicKey;
import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;
    public CandyBox(){
        System.out.println("CandyBox constructor");
    }

    public CandyBox(String flavor, String origin) {
        System.out.println("CandyBox constructor with parameters");
        this.flavor = flavor;
        this.origin = origin;
    }
    public float getVolume(){return 0f;}
    @Override
    public String toString() {
        return "{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }
    public void printDim(){}

}
