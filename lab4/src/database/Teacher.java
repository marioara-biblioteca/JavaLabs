package database;
import java.util.*;
import database.Database;

import javax.xml.crypto.Data;

public class Teacher extends Person{
    private List<String> subjects;
    public Teacher(){super();}

    public Teacher(String name, String surname, List<String> subjects) {
        super(name, surname);
        this.subjects = subjects;
    }

    public Teacher(Teacher t) {
        super(t);
        this.subjects = t.subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    @Override
    public String toString() {
        return "Teacher: " + this.getName() + " " + this.getSurname() + "\n"
                + "Subjects: " + subjects + "\n";
    }
    public List<Teacher> getAllTeachers() {
        return Database.getInstance().findAllTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Database.getInstance().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        return Database.getInstance().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        return Database.getInstance().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        return Database.getInstance().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return Database.getInstance().getStudentsByGradeForSubject(subject);
    }
}
