import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        try {
            Scanner input = new Scanner(new File("./src/data/prog213f.dat"));


            while(input.hasNext()) {
                nums.add(input.nextInt());
            }

            for(int kilowats : nums) {
                int cost = 0;

                if (kilowats <= 2000) {
                    cost += kilowats * 0.07;
                }

                if (kilowats >= 2000 && kilowats < 10000) {
                    cost += 2000 * 0.07;
                    cost += ((kilowats - 2000) * 0.05);
                }

                if (kilowats >= 10000) {
                    cost += 2000 * 0.07;
                    cost += ((8000) * 0.05);
                    cost += ((kilowats - 10000) * 0.04);
                }

                System.out.println("The cost of " + kilowats + " was " + cost );
            }
        } catch(IOException e) {

        }
    }
}
