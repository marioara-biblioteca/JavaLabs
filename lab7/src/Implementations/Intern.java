package Implementations;

//TODO implementati interfata Visitable
public class Intern implements Visitable {

    private String  name;
    private int duration;  // in months

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
