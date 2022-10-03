import java.util.*;

class Prog65h {
    public static void main(String[] args) {
        Scanner listner = new Scanner(System.in);
        
        /* 5 pounds 2 shinlings, and 8 pence /*
        /* 5 + (2/ 20)  + ((1 / 20) /  12) * 8)  */
        
        double pounds = 0;
        double shillings = 0;
        double pence = 0;
        
        double total = 0;
        
        System.out.print("How many pounds : " );
        pounds = listner.nextInt();
        System.out.print("\nHow many shillings : ");
        shillings = listner.nextInt();
        System.out.print("\nHow many pence : ");
        pence = listner.nextInt();
        
        total = pounds + (shillings / 20) + (((1 / (double)20) / 12) * pence);
        
        System.out.print("\nTotal : " + total);
    }
}

/*
How many pounds : 5
How many shillings : 2
How many pence : 8
Total : 5.133333333333333
*/ 
