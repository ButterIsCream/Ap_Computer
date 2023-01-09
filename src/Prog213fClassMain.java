import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog213fClassMain {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog213f.dat"));

            while(input.hasNext()) {
                int kilowats = input.nextInt();

                if (kilowats > 0) {
                    Prog213fClass data = new Prog213fClass(kilowats);

                    double cost = data.grabCost();

                    System.out.println("The cost of " + kilowats + " is " + cost);
                }
            }
        } catch(IOException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
