package ClassPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RecapUtilities {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileInputStream inputStream = new FileInputStream("src/test/resources/settings.properties");
        pro.load(inputStream);
    }
}
