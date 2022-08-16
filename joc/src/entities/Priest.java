package entities;

//extra attribute: knowledge
public class Priest extends Hero{
    private int knowledge;
    public Priest(String name) {
        super(name);
    }

    @Override
    public void attack() {

    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return "Priest{" +
                "knowledge=" + knowledge +
                ", name='" + name + '\'' +
                ", inventory=" + inventory +
                ", posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}
