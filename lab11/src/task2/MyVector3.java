package task2;

import java.util.Random;

public class MyVector3 implements Summable{
   private int x,y,z; //am incercat cu T dar java nu suporta overload la + pe MyVector<T>

    public MyVector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public MyVector3(){
        Random rand=new Random();
        this.x=rand.nextInt();
        this.y= rand.nextInt();
        this.z=rand.nextInt();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public void addValue(Summable value) {
        this.x+=((MyVector3)value).x;
        this.y+=((MyVector3)value).y;
        this.z+=((MyVector3)value).z;
    }

    @Override
    public String toString() {
        return "MyVector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public void printVector(){
        System.out.println(this.toString());
    }
}
