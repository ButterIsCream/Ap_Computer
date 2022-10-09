import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        int packWeight = 0;
        int packLength = 0;
        int packWidth = 0;
        int packHeight = 0;
        int tCen = 0;
        double tMet = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms : ");
        packWeight = input.nextInt();
        System.out.print("Enter package length in centimeters : ");
        packLength = input.nextInt();
        System.out.print("Enter package width in centimeters : ");
        packWidth = input.nextInt();
        System.out.print("Enter package height in centimeters : ");
        packHeight = input.nextInt();

        tCen = packLength * packWidth * packHeight;
        tMet = tCen / 100000;


        if (packWeight > 27 && tMet >= 0.1) {
            System.out.println("To heavy and too large");
        } else if (packWeight > 27) {
            System.out.println("To heavy");
        } else if (tMet >= 0.1) {
            System.out.println("To large");
        }
    }
}
