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

    static class Prog982a {

        public static double round(double number,double decimals) {
            double rounded = 0;

            rounded = Math.round(number / decimals) * decimals;

            return rounded;
        }

        public static void main(String[] args) {
            Scanner listner = new Scanner(System.in);

            int speedLimit = 0;
            int carSpeed = 0;
            int speedDiff = 0;
            double total = 0;

            System.out.print("The speed limit is : ");
            speedLimit = listner.nextInt();
            System.out.print("\n The Vehicle Speed is : ");
            carSpeed = listner.nextInt();

            speedDiff = carSpeed - speedLimit;
            total = 20 + (speedDiff * 5);

            System.out.print("\n The total fine is : $" + total);
        }
    }
}
