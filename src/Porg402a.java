import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Porg402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/p402a.dat"));

            int amount = 0;
            int sum = 0;
            double average = 0;

            while(input.hasNext()) {
                amount += 1;
                sum += input.nextInt();
            }

            average = (double)sum / amount;

            System.out.println("The average amoung " + amount + " students is " + average);
        } catch (IOException e){

        }
    }
}
