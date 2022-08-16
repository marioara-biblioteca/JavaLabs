package database;
import jdk.jfr.DataAmount;

import javax.xml.crypto.Data;
import java.util.*;

public class Database {
    private final List<Student>students;
    private final List<Teacher>teachers;
    private static Database dbInstance=null;
    private Database(){
        students=new ArrayList<>();
        teachers=new ArrayList<>();
    }
    private Database(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }
    public static Database getInstance(){
        if(Database.dbInstance==null){
            Database.dbInstance=new Database();
        }
        return Database.dbInstance;
    }
    public static int getNumberOfInstances(){
        if(Database.dbInstance==null)
            return 0;
        else return 1;
    }
    public void addTeachers(List<Teacher> teachers){
        Database.getInstance().teachers.addAll(teachers);
    }
    public void addStudents(List<Student>students){
        Database.getInstance().students.addAll(students);
    }
    public List<Student> findAllStudents() {

        return Database.getInstance().students;
    }

    public List<Teacher> findAllTeachers() {
        return Database.getInstance().teachers;
    }
    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher>auxTeachers=new ArrayList<Teacher>();
        for(Teacher teacher : Database.getInstance().teachers){
            if(teacher.getSubjects().contains(subject)){
                auxTeachers.add(teacher);
            }
        }
        return auxTeachers;
    }
    public List<Student> getStudentsBySubject(String subject) {
        List<Student>auxStudents=new ArrayList<Student>();
        for(Student s : Database.getInstance().students){
            if(s.getSubjects().containsKey(subject))
                auxStudents.add(s);
        }
        return auxStudents;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> auxStudents=new ArrayList<>(Database.getInstance().students);
        Collections.sort(auxStudents,(a, b) -> a.averageGrade() < b.averageGrade() ? -1 : a.averageGrade() == b.averageGrade() ? 0 : 1);
        return auxStudents;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> auxStudents=Database.getInstance().getStudentsBySubject(subject);
        Collections.sort(auxStudents,(a, b) -> a.averageGrade() < b.averageGrade() ? -1 : a.averageGrade() == b.averageGrade() ? 0 : 1);
        return auxStudents;
    }
}
