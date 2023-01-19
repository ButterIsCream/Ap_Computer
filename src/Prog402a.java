import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/p402a.dat"));
            ArrayList<Integer> list = new ArrayList<>();
            double average = 0;

            System.out.println("Difference Numbers");

            while(input.hasNext()) {
                list.add(input.nextInt());
            }


            for(int num : list) {
                System.out.println(num);
                average+=num;
            }

            average /= list.size();

            System.out.println(average);

        } catch(IOException e) {

        }
    }
}
