package task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void readAndPrintLine() {
        String str = null;
        StringBuilder strb = new StringBuilder();
        // TODO: Read a line from stdin and print it to stdout
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
       try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
           while((str=reader.readLine())!=null){
               strb.append(str).append("\n");
           }
       }catch (IOException e){
           e.printStackTrace();
       }finally {
           System.out.println(strb);
       }

    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}