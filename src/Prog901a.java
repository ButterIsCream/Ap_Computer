import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Prog901a {
    private static ArrayList<String> blines = new ArrayList<>();

    public static ArrayList<String> backwards(ArrayList<String> lines,int index) {

        if(index == lines.size() - 1) {return blines;};

        String line = lines.get(index);
        String newStr = "";

        for(int i = line.length(); i > 0; i--) {
            newStr += line.substring(i - 1,i);
        }

        lines.set(index,newStr);
        backwards(lines,index + 1);

        return lines;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog901a.dat"));

            ArrayList<String> lines = new ArrayList<>();
            System.out.println("Normal Output");

            while(input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
                lines.add(line);
            }

            System.out.println("Weird Output");

            ArrayList<String> blines = backwards(lines,0);

            for(String line : blines) {
                System.out.println(line);
            }

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
