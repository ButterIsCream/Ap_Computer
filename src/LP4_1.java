import java.util.*;

public class LP4_1 {
    public static void main(String[] args) {
        int copys = 0;
        double pCopy = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Amount of copys you want : ");
        copys = input.nextInt();

        if (copys <= 0.99) {
            pCopy = 0.30;
        } else if (copys <= 499) {
            pCopy = 0.28;
        } else if (copys <= 749) {
            pCopy = 0.27;
        } else if (copys <= 1000) {
            pCopy = 0.26;
        } else {
            pCopy = 0.25;
        }

        total = copys * pCopy;
        System.out.print("Price per copy : " + pCopy);
        System.out.print("\nTotal for the copys : " + total);
    }
}
