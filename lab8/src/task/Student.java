package task;

import java.util.Objects;
import java.util.UUID;

public class Student implements Comparable<Student>{

    private String name;
    private String surname;
    private long id=UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    private double average;

    public Student(String name, String surname, double average) {
        this.name = name;
        this.surname = surname;
        this.average = average;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student o) {
        if(this.average==o.average)
            if(this.surname.equals(o.surname))
                return this.name.compareTo(o.name);
            else return this.surname.compareTo(o.surname);
        else
            return Double.compare(this.average,o.average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.average, average) == 0 && name.equals(student.name) && surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, average);
    }

    public void setId(long id) {
        this.id = id;
    }
}
