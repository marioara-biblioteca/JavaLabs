package array;

public class Array {
    static final int ERROR = Integer.MIN_VALUE;
    protected boolean flag=false;
    protected int[] actualArray;
    public int getLength(){
        return this.actualArray.length;
    }
    public Array() {
        this(10);
    }

    Array(final int n) {
        actualArray = new int[n];
    }

    int get(final int pos) {
        if (pos < 0 || pos >= actualArray.length) {
            flag=true;
            return ERROR;
        }
        if(actualArray[pos]==this.ERROR)
            flag=false;
        return actualArray[pos];

    }

    int set(final int pos, final int val) {
        if (pos < 0 || pos >= actualArray.length) {
            flag=true;
            return ERROR;
        }
        if(val==this.ERROR) flag=false;
        actualArray[pos] = val;
        return 0;
    }
    public String toString() {
        StringBuilder s = new StringBuilder("[");

        for (int i = 0; i < actualArray.length; i++) {
            s.append(actualArray[i]).append(" ");
        }
        return s + "]";
    }

}