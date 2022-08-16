package task1;

public class Test {
    public static void main(String[] args) {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex();
        Complex c3=new Complex(c1);
        c1.addWithComplex(c2);
        c1.showNumber();
        c1.addWithComplex(c3);
        c1.showNumber();
    }
}
