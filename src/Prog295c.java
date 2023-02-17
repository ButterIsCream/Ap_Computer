import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner m1 = new Scanner(new File("./src/data/merge1.dat"));
            Scanner m2 = new Scanner(new File("./src/data/merge2.dat"));

            ArrayList<String> ssn = new ArrayList<>();

            while(m1.hasNext()) {
                ssn.add(m1.next());
                ssn.add(m1.next());
            }

            while(m2.hasNext()) {
                ssn.add(m2.next());
                ssn.add(m2.next());
            }

            System.out.println("Social Sec#" + "\tClass\tType\tDept");

            for(int i = 0; i < ssn.size(); i+=2) {
                String s = ssn.get(i);
                String d = ssn.get(i + 1);

                String cl = d.substring(0,1);
                String ty = d.substring(1,2);
                String de = d.substring(2,3);

                System.out.println(s + "\t" + cl + "\t\t" + ty + "\t\t" + de);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
