/* I was just messing with arrays I know this isn't the best way to do it, but I wanted to understand how java handled them. It honestly isn't that different from c++*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            int currentComp = 0;
            Scanner input = new Scanner(new File("./src/data/prog215h.dat"));
            ArrayList<ArrayList<Double>> array = new ArrayList<>();
            array.add(new ArrayList<Double>());

            while(input.hasNext()) {
                double average = Double.parseDouble(input.next());
                ArrayList<Double> comp = array.get(currentComp);

                if (comp.size() == 8) {
                    currentComp += 1;
                }

                if (array.size() == currentComp + 1) {
                    array.add(new ArrayList<Double>());
                }

                comp = array.get(currentComp);
                comp.add(average);
            }


            input.close();
            array.remove(array.size() - 1);

            int contestInt = 1;

            for(ArrayList<Double> contest : array) {
                double average = 0;
                System.out.print("Contest " + contestInt + "\n");

                for(double score : contest) {
                    average += score;
                    System.out.print(score + " ");
                }

                average /= 8;
                System.out.print("=" + average + "\n");
                contestInt+=1;
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
