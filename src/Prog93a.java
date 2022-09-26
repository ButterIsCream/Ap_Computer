import java.util.*;

class Prog93a {
    
    public static double round(double number,double decimals) {
        double rounded = 0;

        rounded = Math.round(number / decimals) * decimals;

        return rounded;
    }
    
    public static void main(String[] args) {
        Scanner listner = new Scanner(System.in);
        
        int kilwats = 0;
        double perkil = 0;
        double supercharge = 0;
        double tax = 0;
        double total = 0;
        double totalFee = 0;
        
        System.out.print("Killo Wats Used : ");
        
        kilwats = listner.nextInt();
        
        System.out.print("\n");
        
        perkil = 0.0475 * kilwats;
        supercharge = perkil * 0.1;
        tax = perkil * 0.03;
        total = perkil + supercharge + tax;
        totalFee = total + (total * 0.04);
        
        System.out.println("Base Rate : " + round(perkil,10));
        System.out.println("Supercharge : " + round(supercharge,10));
        System.out.println("City Tax : " + round(tax,10));
        System.out.println("Total : " + round(total,10));
        System.out.println("After Pay Date : " + round(totalFee,10));
    }
}
