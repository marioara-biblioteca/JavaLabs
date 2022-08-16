package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyMatrix implements Summable{
    private int[][] matrix=new int[4][4];
    public MyMatrix(){
        Random rand=new Random();
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                matrix[i][j]=rand.nextInt();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public void addValue(Summable value) {
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                this.matrix[i][j]+=((MyMatrix)value).matrix[i][j];
    }

    public void printMatrix(){
        System.out.println("MyMatrix{ ");
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++) System.out.println(matrix[i][j] +"  ");
        System.out.println("}");
    }
}
