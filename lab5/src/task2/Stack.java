package task2;

import task1.Task;

import java.util.ArrayList;

public class Stack extends Vector{
    public Stack(){

    }
    public Stack( ArrayList<Task> tasks) {
        super( tasks);
    }


    @Override
    public void push(Task task) {
        ArrayList<Task>tasks=getTasks();
        tasks.add(0,task);
    }

}
