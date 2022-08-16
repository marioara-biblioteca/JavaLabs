package array;

public class QueueInheritance extends Array{
    private int end=0;
    private int start=0;
    public QueueInheritance(){
        super();
    }

    public QueueInheritance(int n) {
        super(n);
    }
    //in Array avem set() si get() definite cu final ca sa nu poata fi suprascrise
    //dar trebuie sa le ascundem ca sa folosim doar enqueue si dequeue

    @Override
    int get(int pos) {
        System.out.println("Cannot use this method. Use dequeue instead!");
        return this.ERROR;
    }

    @Override
    int set(int pos, int val) {
        System.out.println("Cannot use this method. Use enqueue instead!");
        return this.ERROR;
    }

     final int enqueue(int val){
        int res=super.set(start,val);
        if(res==0)
            end++; //am adaugat cu succes
        else if (res==ERROR) System.out.println("Cant add item, queue is full");
        return res;
     }
    final int dequeue() {
        System.out.println("start: "+start+" end: "+end);
        if (start < end & end-start<=actualArray.length) {
            int res=super.get(start);
            if (res == ERROR & this.flag == true) {
                System.out.println("Cant get item");
                flag=true;
                return ERROR;
            }else{
                start++;
                return res;
            }
        }else{

            flag=true;
            if(start==end){
                System.out.println("Queue is empty");
                start=0;
                end=0;
            }else{
                System.out.println("Queue is full start dequeuinh");
            }
            return ERROR;
        }

    }

    @Override
    public String toString() {
        String res="Queue now: "+(end-start)+"\n";
        for(int i=start;i<end;i++){
            res=res+actualArray[i]+"  ";
        }
        return res;
    }
}
