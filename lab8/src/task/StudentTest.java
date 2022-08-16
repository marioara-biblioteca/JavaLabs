package task;
import org.junit.jupiter.api.*;

public class StudentTest {
    private Student student;
    @BeforeEach
    public  void setUp(Student s){
        this.student=new Student(s.getName(),s.getSurname(),s.getAverage());
        this.student.setId(s.getId());
    }
    @AfterEach
    public void clean(){
        this.student=null;
    }
    @Test
    @DisplayName("Equals test")
    public void testEquals(){


    }
    @Test
    @DisplayName("ToString test")
    public void testString(){
        //Student{name='Andrei', surname='Pop', id=1231476996903095062, average=9.45}
        Assertions.assertEquals("Student{name='"+student.getName()+"', surname='"+student.getSurname()+
                "', id="+student.getId()+", average="+student.getAverage()+"}",student.toString());
        Assertions.assertNotEquals("{name='"+student.getName()+"', surname='"+student.getSurname()+
                "', id="+student.getId()+", average="+student.getAverage()+"}",student.toString());
    }
    @Test
    @DisplayName("Compare test")
    public void testCompareTo(){

    }

}
