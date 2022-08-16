package task2;

public class Student {
    private String name;
    private int year;
    public Student(){

    }
    public Student(String n,int y){
        this.name=n;
        this.year=y;
    }
    public void setName(String n){name=n;}
    public void setYear(int y){year=y;}
    public String getName(){return name;}
    public int getYear(){return year;}
}
