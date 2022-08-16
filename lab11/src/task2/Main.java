package task2;

import java.util.*;

public class Main {
    public static void addAll(Collection<? extends Summable>sumableList){
        Iterator<? extends Summable>it=sumableList.iterator();
        Summable first=it.next();
        while(it.hasNext()){
            first.addValue(it.next());
        }
    }
    public static void main(String[] args) {

    }

}