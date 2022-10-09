import java.util.*;

public class LP4_10 {
    public static void main(String[] args) {
        int rLength = 0;
        int rWidth = 0;
        int rHeight = 0;
        int rVol = 0;

        double sRad = 0;
        double sVol = 0;
        double pi = Math.PI;

        int sqLength = 0;
        int sqVol = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Rectangular Prism\n");
        System.out.print("Enter the length : ");
        rLength = input.nextInt();
        System.out.print("Enter the width : ");
        rWidth = input.nextInt();
        System.out.print("Enter the height : ");
        rHeight = input.nextInt();

        rVol = rLength * rWidth * rHeight;

        System.out.println("The volume is : " + rVol + "\n");

        System.out.print("Sphere\n");
        System.out.print("Enter the radius : ");
        sRad = input.nextDouble();
        sVol = (4/3) * pi * Math.pow(sRad,3);
        System.out.print("The volume is " + sVol);

        System.out.print("Square\n");
        System.out.print("Enter the length of each side : ");
        sqLength = input.nextInt();
        sqVol = sqLength * sqLength * sqLength;
        System.out.print("The volume is " + sVol);



    }
}
