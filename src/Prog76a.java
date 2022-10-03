import java.util.*;

class Prog76a {
    public static void main(String[] args) {
        Scanner listner = new Scanner(System.in);
        
        int number = 0;
        int times9 = 0;
        int total = 0;
        
        System.out.print("Enter a number you dislike : ");
        number = listner.nextInt();
        
        if (number >= 10 || number <= 0) {
            System.out.print("\n This number in non vaild it most be 1-9");
            return;
        }
        
        times9 = number * 9;
        total = times9 * 12345679;
        
        System.out.print("\n " + number + "\n 9X \n ___________ \n " + times9 + "\n X 12345679 \n ___________ \n " + total);
    }
}

/*
 5
 9X 
 ___________ 
 45
 X 12345679 
 ___________ 
 555555555
*/ 
