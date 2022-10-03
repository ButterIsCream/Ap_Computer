import java.util.*;

class Prog72t {
    public static void main(String[] args) {
        Scanner listner = new Scanner(System.in);
        
        int firstT = 0;
        int secondT = 0;
        int hours = 0;
        int minutes = 0;
        int timeDiff = 0;
        
        System.out.print("First time : ");
        firstT = listner.nextInt();
        System.out.print("\n Second time : ");
        secondT = listner.nextInt();
        
        if (secondT > firstT) {
            timeDiff = secondT - firstT;
        } else {
            timeDiff = (2400 - firstT) + secondT;
        }
        
        hours = timeDiff / 100;
        minutes = timeDiff & 100;
        
        
        
        System.out.print("\n" + hours + " hours and " + minutes + " minutes.");
    }
}
