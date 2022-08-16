package task;

import java.util.HashSet;

public class MyHashSet extends HashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        return (integer%2==0)? super.add(integer):false;
    }
}
