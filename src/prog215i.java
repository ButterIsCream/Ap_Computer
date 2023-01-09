import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog215i.dat"));

            System.out.println("Vehcile\tMiles\tGallons\t\tMPG");

            for(int i = 0; i <= 24; i = i + 3) {
                int vehicle = input.nextInt();
                double gallons = input.nextDouble();
                double miles = input.nextDouble();

                if (gallons != 0 && miles != 0) {

                    double MPG = miles / gallons;

                    System.out.printf("%s\t%s\t%s\t\t%.2f\n", vehicle, miles, gallons, MPG);
                }
            }
        } catch (IOException e) {
            System.out.println("Error thrown : " + e);
        }
    }
}
