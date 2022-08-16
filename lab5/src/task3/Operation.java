package task3;

public class Operation implements Plus,Mul,Minus,Div{
    private float f;

    public Operation(float f) {
        this.f = f;
    }

    public float getNumber() {
        return f;
    }

    @Override
    public void div(float f) {
        if(f!=0){
            this.f/=f;
        }else{
            System.out.println("Zero division");
        }
    }

    @Override
    public void minus(float f) {
        this.f-=f;
    }

    @Override
    public void mul(float f) {
        this.f*=f;
    }

    @Override
    public void plus(float f) {
        this.f+=f;
    }
}
