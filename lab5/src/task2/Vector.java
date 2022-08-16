package task2;

import task1.Task;

import java.util.ArrayList;

abstract public class Vector implements Container{
    private ArrayList<Task> tasks=new ArrayList<>();
    public Vector( ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public Vector(){

    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    @Override
    public Task pop() {
         if(!this.isEmpty()) {
             Task t=this.tasks.get(0);
             this.tasks.remove(0);
             return t;
         }else return null;
    }

    @Override
    public int size() {
        return this.tasks.size();
    }

    @Override
    public boolean isEmpty() {
        System.out.println(tasks.size());
        return (this.tasks.size() > 0 ? false : true);
    }
    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()){
            Task t=container.pop();
            this.push(t);
        }
    }
}
