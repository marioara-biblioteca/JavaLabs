package entities;

//additional attack: magicAttack
public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {

    }
    public void magicAttack(){

    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", inventory=" + inventory +
                ", posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}