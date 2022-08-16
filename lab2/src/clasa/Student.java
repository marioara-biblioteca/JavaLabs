package clasa;

import clasa.Group;

public class Student {
    private String name;
    private int averageGrade;
    private Group group;
    public Student(Group group,String name, int averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.group=group;
    }

    @Override
    public String toString() {
        return "clasa.Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
