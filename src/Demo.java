import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        File f = new File("src/myfile.txt");

        // WRITING
        try {
            f.createNewFile(); // this method will create the file if it does not exist; if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/myfile.txt");
            fw.write("hello");
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR! + " + e.getMessage());
        }

        // READING
        try {
            Scanner s = new Scanner(f);
            String text = s.nextLine();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}