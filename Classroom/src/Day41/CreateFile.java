package Day41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        System.out.println("C:\\Users\\Aspire_R_14\\Desktop\\ptacrices\\Classroom\\src\\Day41");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file name: ");
        String fileName = scanner.nextLine();
       ///
        String filePath = "C:\\Users\\Aspire_R_14\\Desktop\\ptacrices\\Classroom\\src\\Day41";
        filePath += "/"  + fileName + " .text";

        //create a file in "filePath"
        //write in the file "bath 4 good evening"
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("bath 4 good evening");
        fileWriter.write("\2ndLine");
        fileWriter.write("\3ndLine");

        fileWriter.close();
    }
}
