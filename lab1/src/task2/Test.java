package task2;
import java.util.*;
public class Test {
    public static void main(String[] args){
//        Random rand=new Random();
//        Student[]students=new Student[4];
//        for(int i=0;i<students.length;i++) {
//            students[i] = new Student("Ana", rand.nextInt(4) + 1);
//            System.out.println(students[i].name+" "+String.valueOf(students[i].year));
//        }
//        Course course=new Course("OOP","Invatam abstractizare, incapsulare, mostenire, polimorfism ",students);
//        try {
//            ArrayList<Student> result = course.filterYears(Integer.parseInt(args[0]));
//            if(result.size()>0){
//                System.out.println("Am gasit "+String.valueOf(result.size())+" studenti in anul "+String.valueOf(args[0])+" de studiu");
//            }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        Student s1=new Student("Ana",2);
        Student s2=new Student("Ana",2);
//        s2.name="Ana";
//        s2.year=2
        if(s1==s2)
            System.out.println("== merge");
        if(s1.equals(s2))
            System.out.println("equals merge");
        s1=s2;
        if(s1==s2)
            System.out.println("== merge pt 2");
        if(s1.equals(s2))
            System.out.println("equals merge pt 2");
    }
}
