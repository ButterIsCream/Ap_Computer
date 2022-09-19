import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner listener = new Scanner(System.in);

        int daysComp = 0;
        int daysintr = 0;
        int orgin_p = 0;

        double amount = 0;
        double rate = 0;
        double intrest = 0;
        double totalSavings = 0;

        System.out.println("The amount saved : ");
        orgin_p = listener.nextInt();

        System.out.println("The intrest rate : ");
        rate = listener.nextDouble();

        System.out.println("Number of times compunded per year : ");
        daysComp = listener.nextInt();

        System.out.println("Number of days of intrest : ");
        daysintr = listener.nextInt();


        amount = orgin_p * ( 1 + Math.pow((0.01 * rate) / daysComp,(daysComp * daysintr) / 365));
        intrest = amount - orgin_p;

        System.out.println("The intrest earned is : " + intrest);
        System.out.println("The amount saved is : " + amount);

    }
}
