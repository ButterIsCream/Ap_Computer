import java.util.*;

public class Prog54c {

    public static double round(double number,double decimals) {
        double rounded = 0;

        rounded = Math.round(number / decimals) * decimals;

        return rounded;
    }
    public static void main(String[] strings) {
        Scanner listner = new Scanner(System.in);

        double pi = 3.14159;
        double rad = 0;
        double cir = 0;
        double area = 0;

        System.out.print("Input the radius : ");
        rad = listner.nextDouble();

        area = pi * Math.pow(rad,2);
        cir = 2 * (rad * pi);

        area = round(area,10);
        cir = round(cir,10);

        System.out.println("The radius is : " + rad);
        System.out.println("The area is : " + area);
        System.out.println("The circumfrience is : " + cir);
    }
}
