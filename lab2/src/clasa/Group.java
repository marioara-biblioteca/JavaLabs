package clasa;

import java.util.Arrays;

public class Group {
    private int noStudents;
    private Student[] students;
    Group(){
        noStudents=0;
        students=new Student[10];
    }
    boolean addStudent(String name, int ag){
        if(noStudents<students.length){
            students[noStudents++]=new Student(this,name,ag);
            return true;
        }
        return false;
    }
    boolean addStudent(Student s){
        if(noStudents<students.length){
            students[noStudents++]=s;
            return true;
        }
        return  false;
    }

    @Override
    public String toString() {
        String res=new String();
        for(int i=0;i<noStudents;i++)
            res+=students[i].toString();
        return res;
    }
}
