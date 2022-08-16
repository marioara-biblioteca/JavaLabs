package array;

public class Test {
    public static void main(final String[] args) {
        QueueInheritance q=new QueueInheritance(4);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        //q.enqueue(6);
        System.out.println(q.toString());
        int elem=q.dequeue();
        System.out.println("elem: "+elem);
        System.out.println(q.toString());
    }
}
