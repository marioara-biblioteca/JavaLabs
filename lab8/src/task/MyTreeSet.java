package task;

import java.util.TreeSet;

public class MyTreeSet extends TreeSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        return (integer%2==0)? super.add(integer):false;
    }
}
