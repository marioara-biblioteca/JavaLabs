package array;
import java.lang.*;
public class QueueAggregation {
    private Array array=null;
    private int start=0;
    private int end=0;

    public int enqueue(int val){
        int res=Integer.MIN_VALUE;
        if(end-start<array.getLength()){
            res=array.set(start,val);
            if(res==0)
                end++;
        }
        return res;
    }
    public int dequeue(){
        int res=Integer.MIN_VALUE;
        if(start>=end){
            System.out.println("queue is empty");
            start=0;
            end=0;
        }else {
            res=array.get(start);
            start++;
        }
        return res;
    }
}
