package task1;
import java.util.*;
public class RandomOutTask implements Task{
    private int number;
    public RandomOutTask(){
        Random rand=new Random();
        this.number=rand.nextInt();
    }
    @Override
    public void execute() {
        System.out.println("Execution from RandomOutTask "+this.number);
    }
}
