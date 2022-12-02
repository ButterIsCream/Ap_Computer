import java.util.Scanner;

public class LP3_10_Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int burgers,fries,sodas;

        System.out.print("Enter the number of burgers : ");
        burgers = input.nextInt();
        System.out.print("Enter the number of fries : ");
        fries = input.nextInt();
        System.out.print("Enter the number of sodas : ");
        sodas = input.nextInt();

        LP3_10_Class calculations = new LP3_10_Class(burgers,fries,sodas);

        double total = calculations.grabTotal();
        double tax = calculations.grabTax();

        System.out.printf("Total %s\nTax %s\n",total,tax);
    }
}
