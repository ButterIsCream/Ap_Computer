import java.util.*;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eggsPurchased = 0;
        double extraEggs = 0;
        double perDozen = 0;
        double eggs = 0;
        double total = 0;

        System.out.print("Enter the number of eggs purchased : ");
        eggsPurchased = input.nextInt();

        if (eggsPurchased < 4) {
            perDozen = 0.50;
            eggs = 0;
        } else if (eggsPurchased < 6) {
            perDozen = 0.45;
            eggs = 4;
        } else if (eggsPurchased < 11) {
            perDozen = 0.40;
            eggs = 6;
        } else {
            perDozen = 0.35;
            eggs = 11;
        }

        extraEggs = (1/12) * perDozen;
        total = perDozen + (extraEggs * (eggsPurchased + eggs));
        System.out.println(total);
    }
}
