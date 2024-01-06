package Day41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\Aspire_R_14\\Desktop\\ptacrices\\Classroom\\src\\Day41\\ReadFile.java";

        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
