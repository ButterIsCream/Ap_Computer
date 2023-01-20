import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog214c.dat"));

            while(input.hasNext()) {
                String gasType = input.next();
                int gallons = input.nextInt();
                String carWash = input.next();
                double perGallons = 0;
                double total = 0;
                double carWashPrice = 0;

                if(gasType.matches("R")) {
                    perGallons = 1.359;
                } else if(gasType.matches("P")) {
                    perGallons = 1.479;
                } else if (gasType.matches("H")) {
                    perGallons = 1.429;
                }


                total = gallons * perGallons;
                carWashPrice = 2;

                System.out.println(gallons + " " + total + " " + carWashPrice);


            }
        } catch(IOException e) {

        }
    }
}
