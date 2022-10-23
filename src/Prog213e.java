import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Prog213e {
    public static void main(String[] args) {
        FileInputStream fstream;

        try {
            fstream = new FileInputStream("prog213e.dat");
        } catch (FileNotFoundException e){
            System.out.print("File not found");
        }

        System.out.println();
    }
}
