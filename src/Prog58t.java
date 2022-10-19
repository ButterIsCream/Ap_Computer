import java.lang.constant.Constable;
import java.util.*;

public class Prog58t {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double purchasePrice = 0;
        double amountRec = 0;
        double changeDue = 0;

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        double current = 0;

        System.out.print("Enter purchase price : ");
        purchasePrice = input.nextDouble();

        System.out.print("Enter amoutn received : ");
        amountRec = input.nextDouble();


        changeDue = amountRec - purchasePrice;
        System.out.print("Charge Due : " + changeDue + "\n");

        dollars = (int)(changeDue / 1);
        current = dollars % 1;
        quarters = (int)(current / 0.25);
        current = (current % 0.25);
        dimes = (int)(current / 0.10);
        current = (current % 0.5);
        pennies = (int)(current / 0.1);

        System.out.printf("Dollars : %s\n Quarters : %s\n Dimes : %s\n Pennies : %s\n");
    }
}
