package task;
import java.util.*;
public class MyLinkedHashSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        return (integer%2==0)? super.add(integer):false;
    }
}
