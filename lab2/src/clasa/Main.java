package clasa;

public class Main {

    public static void main(String[] args) {
      Group g=new Group();
      Student s1=new Student(g,"Alice",6);
      Student s2=new Student(g,"Bob",10);
      g.addStudent(s1);
      g.addStudent(s2);
      g.addStudent("Chris",8);
      System.out.println(g.toString());
    }
}