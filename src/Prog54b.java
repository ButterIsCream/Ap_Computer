import java.util.*;

public class Prog54b {
    public static void main(String[] strings) {
        Scanner listener = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;

        int sum = 0;
        double average = 0;

        System.out.print("Give the console 4 numbers : \n");
        num1 = listener.nextDouble();
        System.out.println("Num 1 " + num1);
        num2 = listener.nextDouble();
        System.out.println("Num 2 " + num2);
        num3 = listener.nextDouble();
        System.out.println("Num 3 " + num3);
        num4 = listener.nextDouble();
        System.out.println("Num 4 " + num4);


        sum = (int)(num1 + num2 + num3 + num4);
        average = (num1 + num2 + num3 + num4) / 4;

        System.out.println("The sum is : " + sum);
        System.out.println("The Average is : " + average);
    }
}

/*
Give the console 4 numbers :
120
Num 1 120.0
40
Num 2 40.0
50
Num 3 50.0
60
Num 4 60.0
The sum is : 270
The Average is : 67.5
 */