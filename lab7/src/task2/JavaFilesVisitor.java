package task2;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles=new ArrayList<>();

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }
    /**
     * TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor.
     * Add to javaFiles all the Java related files: the ones with .java and .class extensions.
     */

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (attrs.isDirectory()) {
            throw new IllegalStateException("WAT!? Visiting directory: "
                    + file.toAbsolutePath().toString());
        }
        if(file.toString().endsWith(".java") || file.toString().endsWith(".class") ){
            javaFiles.add(file);
        }
        System.out
                .println("Visiting file: " + file.toAbsolutePath().toString());
        return super.visitFile(file, attrs);
    }


    public static void main(String[] args) {

        Path startingDir = Paths.get("./src/task1");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        /*
         * The walkFileTree methods does a depth-first traversal of a directory, starting from startingDir.
         * When it reaches a file, the visitFile method is invoked on the currently visited file.
         */
        try {
            Files.walkFileTree(startingDir, filesVisitor);
            ArrayList<Path> javaFiles = filesVisitor.getJavaFiles();
            System.out.println("Found: "+javaFiles.size()+" files.");
            for(Path file:javaFiles){
                System.out.println(file.toAbsolutePath().toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
