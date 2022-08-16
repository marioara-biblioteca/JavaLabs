package task3;

public class Test {
    public static void main(String[] args) {
        Float[] coords={1.2f,3.2f,5.6f,8.4f,9.5f,2.2f};
        Polygon triangle=new Polygon(coords);
        System.out.println(triangle.toString());
    }
}
