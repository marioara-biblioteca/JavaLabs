package task;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // task 1-6
        ArrayList<Student>students=new ArrayList<>();
        Student s1=new Student("Andrei","Pop",9.45);
        Student s2= new Student("Mihnea","Matei",9.45);
        Student s3=new Student("Alin","Ionescu",8.90);
        Student s4=new Student("Mircea","Cartarescu",7.78);
        Student s5=new Student("Maria","Marinescu",10);
        students.addAll(Arrays.asList(s1,s2,s3,s4,s5));

        /*
        System.out.println("Before sorting: "+students);
        Collections.sort(students);//aici obiectele sunt sortate pe baza metodei (la noi suprascrise) compareTo
        System.out.println("After sorting with overridden compareTo: "+students);
        Collections.sort(students,(s11,s21) -> Double.compare(s21.getAverage(),s11.getAverage()));
        System.out.println("After sorting with lambda: "+students);
        PriorityQueue<Student>priorityQueue=new PriorityQueue<>(students.size(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(),o2.getId());
            }
        });
        priorityQueue.addAll(students);
        System.out.println("After putting in priority queue: "+priorityQueue);
        HashMap<Student,LinkedList<String>> hashMap=new HashMap<>();
        hashMap.put(s1,new LinkedList<String>(Arrays.asList("POO","SDA","PA")) );
        hashMap.put(s2,new LinkedList<String>(Arrays.asList("PSO","PA","IOCLA")) );
        hashMap.put(s3,new LinkedList<String>(Arrays.asList("SO","PC","STD")) );
        hashMap.put(s4,new LinkedList<String>(Arrays.asList("BD","SDA","POO")) );
        hashMap.put(s5,new LinkedList<String>(Arrays.asList("IP","STD","AP")) );
        for(Map.Entry<Student,LinkedList<String>> entry:hashMap.entrySet()){
            System.out.println(entry.getKey().toString()+entry.getValue());
        }

         */
        /*task 7-8
        List<Integer>myList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,20,40,60));

        MyLinkedHashSet myLinkedHashSet=new MyLinkedHashSet();
        myLinkedHashSet.addAll(myList);
        System.out.println("LinkedHashSet size: "+myLinkedHashSet.size());
        for(Integer elem : myLinkedHashSet){
            System.out.println(elem);
        }

        MyHashSet myHashSet=new MyHashSet();
        myHashSet.addAll(myList);
        System.out.println("HashSet size: "+myHashSet.size());
        for(Integer elem : myHashSet){
            System.out.println(elem);
        }

        MyTreeSet myTreeSet=new MyTreeSet();
        myTreeSet.addAll(myList);
        System.out.println("TreeSet size: "+myTreeSet.size());
        Iterator<Integer> it=myTreeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         */
        //task 9
       StudentTest studentTest=new StudentTest();
       studentTest.setUp(s1);
       studentTest.testString();
    }
}