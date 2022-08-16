package task2;
import jdk.jfr.Description;

import java.util.*;
public class Course {
    private String title;
    private String description;
    private Student[] students;
    public Course(String t,String d, Student[]ss){
        this.title=t;
        this.description=d;
        this.students=ss;
    }
    public ArrayList<Student> filterYears(int year){
        ArrayList<Student> stds=new ArrayList<Student>();
        for(int i=0;i<this.students.length;i++){
            if(students[i].getYear()==year){
                stds.add(students[i]);
            }
        }
        return stds;
    }
    public void setTitle(String t){title=t;}
    public void setDescription(String d){description=d;}
    public void setStudents(Student[]s){students=s;}
    public String getTitle(){return title;}
    public String getDescription(){return description;}

    public Student[] getStudents() {return students;}

}
