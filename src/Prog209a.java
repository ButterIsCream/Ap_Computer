import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        int less500 = 0;
        int great500 = 0;
        int total = 0;

        try {
            Scanner input = new Scanner(new File("./src/data/prog215a.dat"));

            while(input.hasNext()) {
                int num = input.nextInt();

                if (num < 500) {
                    less500 += 1;
                } else {
                    great500 += 1;
                }

                total += 1;
            }
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("The number of numbers less than 500 is " + less500);
        System.out.println("The number of numbers greater then 500 is " + great500);
        System.out.println("The total of numbers is " + total);
    }
}
