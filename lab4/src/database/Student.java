package database;
import java.util.*;
public class Student extends Person{
    private Map<String,Integer>subjects;
    public Student(){super();}

    public Student(String name, String surname, Map<String, Integer> subjects) {
        super(name, surname);
        this.subjects = subjects;
    }
    public Student(Student s){
      super(s);
      this.subjects=s.subjects;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public float averageGrade(){
        float average=0f;
        for(Map.Entry<String,Integer>entry:subjects.entrySet())
            average+=((float)entry.getValue());
        return average/subjects.size();
    }

    @Override
    public String toString() {
        return "Student: " + this.getName() + " " + this.getSurname() + "\n"
                + "Subjects: " + subjects + "\n";
    }
    public int getGradeForSubject(String subject){
        return subjects.get(subject);
    }
    public List<Teacher> getAllTeachers() {
        return Collections.unmodifiableList(Database.getInstance().findAllTeachers());
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Collections.unmodifiableList(Database.getInstance().findTeachersBySubject(subject));
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(Database.getInstance().findAllStudents());
    }

    public List<Student> getStudentsBySubject(String subject) {
        return Collections.unmodifiableList(Database.getInstance().getStudentsBySubject(subject));
    }

    public List<Student> getStudentsByAverageGrade() {
        return Collections.unmodifiableList(Database.getInstance().getStudentsByAverageGrade());
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return Collections.unmodifiableList(Database.getInstance().getStudentsByGradeForSubject(subject));
    }

}
