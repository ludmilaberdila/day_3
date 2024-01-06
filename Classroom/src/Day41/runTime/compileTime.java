package Day41.runTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileVisitResult;

public class compileTime {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("filename");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
