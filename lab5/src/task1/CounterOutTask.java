package task1;

public class CounterOutTask implements Task{
    static int counter=0;

    public CounterOutTask() {
    }

    @Override
    public void execute() {
        System.out.println("Execution from CounterOutTask: counter now -> "+counter++);
    }
}
