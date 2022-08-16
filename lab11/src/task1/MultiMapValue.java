package task1;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;

public class MultiMapValue<K, V> {
    HashMap<K ,ArrayList<V>> map=new HashMap<K,ArrayList<V>>();
    public void add(K key, V value) {
        ArrayList<V> list=this.map.get(key);
        if(list==null){
            list=new ArrayList<V>();
            list.add(value);
            map.put(key,list);
            System.out.println("Created new ArrayList for key -> "+key+" added value -> "+value);
        }else{
            if(list.contains(value)){
                System.out.println("Object is already in map");
            }else{
                list.add(value);
                System.out.println("Added value -> "+value+" for existing list for key -> "+key);
            }
        }
    }

    public void addAll(K key, List<V> values) {
        // TODO
        ArrayList<V>list=this.map.get(key);
        if(list==null){
            list=new ArrayList<>(values);
            map.put(key,list);
            System.out.println("Added all elements for new key -> "+key);
        }else
            for(V v:values)
                if(!list.contains(v))
                {list.add(v);System.out.println("Added another element to list for key -> "+key);}

    }

    public void addAll(MultiMapValue<K, V> map) {
        // TODO
        for(Map.Entry<K,ArrayList<V>> entry:map.map.entrySet()){
            this.addAll(entry.getKey(),entry.getValue());
        }
    }

    public V getFirst(K key) {
        // TODO
        ArrayList<V> list=this.map.get(key);
        if(list==null) return null;
        return list.get(0);
    }

    public List<V> getValues(K key) {
        ArrayList<V> list=this.map.get(key);
        if(list==null) return null;
        return list;
    }

    public boolean containsKey(K key) {
       return map.containsKey(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public List<V> remove(K key) {
        List<V>list=map.get(key);
        map.remove(key);
        return list;
    }

    public int size() {
        return map.size();
    }
}