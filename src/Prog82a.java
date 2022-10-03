import java.util.*;

class Prog982a {
    
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

/*
The speed limit is : 30
The Vehicle Speed is : 42
The total fine is : $80.0
*/ 
