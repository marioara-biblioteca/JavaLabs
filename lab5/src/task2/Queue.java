package task2;

import task1.Task;

import java.util.ArrayList;

public class Queue extends Vector{
    public Queue(){

    }
    public Queue( ArrayList<Task> tasks) {
        super( tasks);
    }

    @Override
    public void push(Task task) {
        ArrayList<Task>tasks=getTasks();
        tasks.add(task);
    }


}
