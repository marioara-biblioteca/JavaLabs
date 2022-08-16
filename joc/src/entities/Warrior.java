package entities;

//extra attribute: damage (aka strength)
public class Warrior extends Hero{
    private int strength;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                ", name='" + name + '\'' +
                ", inventory=" + inventory +
                ", posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}
