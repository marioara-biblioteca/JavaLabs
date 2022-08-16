package task1;

class Complex {
    private Integer real;
    private Integer imaginary;

    public Complex(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(){
        this(0,0);
    }
    public Complex(Complex c){
        this.real=c.real;
        this.imaginary=c.imaginary;
    }

    public Integer getReal() {
        return real;
    }

    public void setReal(Integer real) {
        this.real = real;
    }

    public Integer getImaginary() {
        return imaginary;
    }

    public void setImaginary(Integer imaginary) {
        this.imaginary = imaginary;
    }
    public void addWithComplex(Complex c){
        this.real+=c.real;
        this.imaginary+=c.imaginary;
    }

    @Override
    public String toString() {
        return "( " +
                 + real +
                ", i * " + imaginary +
                ')';
    }

    public void showNumber(){
        System.out.println(this.toString());
    }
}
